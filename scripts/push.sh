#!/bin/sh
set -e

git config --global user.name "${GIT_USER_NAME}"
git config --global user.email "${GIT_USER_EMAIL}"

git add src/main/java
git diff --cached --quiet || git commit -m "Update from ${VERSION}"

git tag -a $VERSION -m "Version ${VERSION}"
git push --follow-tags origin main
