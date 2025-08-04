#!/bin/sh
set -e

VERSION_CLEANED="${VERSION#v}"
sed -i "0,/<version>.*<\/version>/s//<version>${VERSION_CLEANED}<\/version>/" pom.xml

git config --global user.name "${GIT_USER_NAME}"
git config --global user.email "${GIT_USER_EMAIL}"

git add src/main/java
git add pom.xml
git diff --cached --quiet || git commit -m "Update from ${VERSION}"

git tag -a $VERSION -m "Version ${VERSION}"
git push --follow-tags origin main
