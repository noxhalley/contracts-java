package org.noxhalley.contracts.author.v1;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@io.grpc.stub.annotations.GrpcGenerated
public final class AuthorServiceGrpc {

  private AuthorServiceGrpc() {}

  public static final java.lang.String SERVICE_NAME = "author.v1.AuthorService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<org.noxhalley.contracts.author.v1.AuthorOuterClass.GetAuthorRequest,
      org.noxhalley.contracts.author.v1.AuthorOuterClass.GetAuthorResponse> getGetAuthorMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetAuthor",
      requestType = org.noxhalley.contracts.author.v1.AuthorOuterClass.GetAuthorRequest.class,
      responseType = org.noxhalley.contracts.author.v1.AuthorOuterClass.GetAuthorResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.noxhalley.contracts.author.v1.AuthorOuterClass.GetAuthorRequest,
      org.noxhalley.contracts.author.v1.AuthorOuterClass.GetAuthorResponse> getGetAuthorMethod() {
    io.grpc.MethodDescriptor<org.noxhalley.contracts.author.v1.AuthorOuterClass.GetAuthorRequest, org.noxhalley.contracts.author.v1.AuthorOuterClass.GetAuthorResponse> getGetAuthorMethod;
    if ((getGetAuthorMethod = AuthorServiceGrpc.getGetAuthorMethod) == null) {
      synchronized (AuthorServiceGrpc.class) {
        if ((getGetAuthorMethod = AuthorServiceGrpc.getGetAuthorMethod) == null) {
          AuthorServiceGrpc.getGetAuthorMethod = getGetAuthorMethod =
              io.grpc.MethodDescriptor.<org.noxhalley.contracts.author.v1.AuthorOuterClass.GetAuthorRequest, org.noxhalley.contracts.author.v1.AuthorOuterClass.GetAuthorResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetAuthor"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.noxhalley.contracts.author.v1.AuthorOuterClass.GetAuthorRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.noxhalley.contracts.author.v1.AuthorOuterClass.GetAuthorResponse.getDefaultInstance()))
              .setSchemaDescriptor(new AuthorServiceMethodDescriptorSupplier("GetAuthor"))
              .build();
        }
      }
    }
    return getGetAuthorMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.google.protobuf.Empty,
      org.noxhalley.contracts.author.v1.AuthorOuterClass.ListAuthorsResponse> getListAuthorsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListAuthors",
      requestType = com.google.protobuf.Empty.class,
      responseType = org.noxhalley.contracts.author.v1.AuthorOuterClass.ListAuthorsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.google.protobuf.Empty,
      org.noxhalley.contracts.author.v1.AuthorOuterClass.ListAuthorsResponse> getListAuthorsMethod() {
    io.grpc.MethodDescriptor<com.google.protobuf.Empty, org.noxhalley.contracts.author.v1.AuthorOuterClass.ListAuthorsResponse> getListAuthorsMethod;
    if ((getListAuthorsMethod = AuthorServiceGrpc.getListAuthorsMethod) == null) {
      synchronized (AuthorServiceGrpc.class) {
        if ((getListAuthorsMethod = AuthorServiceGrpc.getListAuthorsMethod) == null) {
          AuthorServiceGrpc.getListAuthorsMethod = getListAuthorsMethod =
              io.grpc.MethodDescriptor.<com.google.protobuf.Empty, org.noxhalley.contracts.author.v1.AuthorOuterClass.ListAuthorsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListAuthors"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.noxhalley.contracts.author.v1.AuthorOuterClass.ListAuthorsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new AuthorServiceMethodDescriptorSupplier("ListAuthors"))
              .build();
        }
      }
    }
    return getListAuthorsMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static AuthorServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<AuthorServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<AuthorServiceStub>() {
        @java.lang.Override
        public AuthorServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new AuthorServiceStub(channel, callOptions);
        }
      };
    return AuthorServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports all types of calls on the service
   */
  public static AuthorServiceBlockingV2Stub newBlockingV2Stub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<AuthorServiceBlockingV2Stub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<AuthorServiceBlockingV2Stub>() {
        @java.lang.Override
        public AuthorServiceBlockingV2Stub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new AuthorServiceBlockingV2Stub(channel, callOptions);
        }
      };
    return AuthorServiceBlockingV2Stub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static AuthorServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<AuthorServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<AuthorServiceBlockingStub>() {
        @java.lang.Override
        public AuthorServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new AuthorServiceBlockingStub(channel, callOptions);
        }
      };
    return AuthorServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static AuthorServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<AuthorServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<AuthorServiceFutureStub>() {
        @java.lang.Override
        public AuthorServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new AuthorServiceFutureStub(channel, callOptions);
        }
      };
    return AuthorServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public interface AsyncService {

    /**
     */
    default void getAuthor(org.noxhalley.contracts.author.v1.AuthorOuterClass.GetAuthorRequest request,
        io.grpc.stub.StreamObserver<org.noxhalley.contracts.author.v1.AuthorOuterClass.GetAuthorResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetAuthorMethod(), responseObserver);
    }

    /**
     */
    default void listAuthors(com.google.protobuf.Empty request,
        io.grpc.stub.StreamObserver<org.noxhalley.contracts.author.v1.AuthorOuterClass.ListAuthorsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListAuthorsMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service AuthorService.
   */
  public static abstract class AuthorServiceImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return AuthorServiceGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service AuthorService.
   */
  public static final class AuthorServiceStub
      extends io.grpc.stub.AbstractAsyncStub<AuthorServiceStub> {
    private AuthorServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AuthorServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new AuthorServiceStub(channel, callOptions);
    }

    /**
     */
    public void getAuthor(org.noxhalley.contracts.author.v1.AuthorOuterClass.GetAuthorRequest request,
        io.grpc.stub.StreamObserver<org.noxhalley.contracts.author.v1.AuthorOuterClass.GetAuthorResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetAuthorMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void listAuthors(com.google.protobuf.Empty request,
        io.grpc.stub.StreamObserver<org.noxhalley.contracts.author.v1.AuthorOuterClass.ListAuthorsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListAuthorsMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service AuthorService.
   */
  public static final class AuthorServiceBlockingV2Stub
      extends io.grpc.stub.AbstractBlockingStub<AuthorServiceBlockingV2Stub> {
    private AuthorServiceBlockingV2Stub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AuthorServiceBlockingV2Stub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new AuthorServiceBlockingV2Stub(channel, callOptions);
    }

    /**
     */
    public org.noxhalley.contracts.author.v1.AuthorOuterClass.GetAuthorResponse getAuthor(org.noxhalley.contracts.author.v1.AuthorOuterClass.GetAuthorRequest request) throws io.grpc.StatusException {
      return io.grpc.stub.ClientCalls.blockingV2UnaryCall(
          getChannel(), getGetAuthorMethod(), getCallOptions(), request);
    }

    /**
     */
    public org.noxhalley.contracts.author.v1.AuthorOuterClass.ListAuthorsResponse listAuthors(com.google.protobuf.Empty request) throws io.grpc.StatusException {
      return io.grpc.stub.ClientCalls.blockingV2UnaryCall(
          getChannel(), getListAuthorsMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do limited synchronous rpc calls to service AuthorService.
   */
  public static final class AuthorServiceBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<AuthorServiceBlockingStub> {
    private AuthorServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AuthorServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new AuthorServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public org.noxhalley.contracts.author.v1.AuthorOuterClass.GetAuthorResponse getAuthor(org.noxhalley.contracts.author.v1.AuthorOuterClass.GetAuthorRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetAuthorMethod(), getCallOptions(), request);
    }

    /**
     */
    public org.noxhalley.contracts.author.v1.AuthorOuterClass.ListAuthorsResponse listAuthors(com.google.protobuf.Empty request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListAuthorsMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service AuthorService.
   */
  public static final class AuthorServiceFutureStub
      extends io.grpc.stub.AbstractFutureStub<AuthorServiceFutureStub> {
    private AuthorServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AuthorServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new AuthorServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.noxhalley.contracts.author.v1.AuthorOuterClass.GetAuthorResponse> getAuthor(
        org.noxhalley.contracts.author.v1.AuthorOuterClass.GetAuthorRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetAuthorMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.noxhalley.contracts.author.v1.AuthorOuterClass.ListAuthorsResponse> listAuthors(
        com.google.protobuf.Empty request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListAuthorsMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_AUTHOR = 0;
  private static final int METHODID_LIST_AUTHORS = 1;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final AsyncService serviceImpl;
    private final int methodId;

    MethodHandlers(AsyncService serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET_AUTHOR:
          serviceImpl.getAuthor((org.noxhalley.contracts.author.v1.AuthorOuterClass.GetAuthorRequest) request,
              (io.grpc.stub.StreamObserver<org.noxhalley.contracts.author.v1.AuthorOuterClass.GetAuthorResponse>) responseObserver);
          break;
        case METHODID_LIST_AUTHORS:
          serviceImpl.listAuthors((com.google.protobuf.Empty) request,
              (io.grpc.stub.StreamObserver<org.noxhalley.contracts.author.v1.AuthorOuterClass.ListAuthorsResponse>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        default:
          throw new AssertionError();
      }
    }
  }

  public static final io.grpc.ServerServiceDefinition bindService(AsyncService service) {
    return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
        .addMethod(
          getGetAuthorMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              org.noxhalley.contracts.author.v1.AuthorOuterClass.GetAuthorRequest,
              org.noxhalley.contracts.author.v1.AuthorOuterClass.GetAuthorResponse>(
                service, METHODID_GET_AUTHOR)))
        .addMethod(
          getListAuthorsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.google.protobuf.Empty,
              org.noxhalley.contracts.author.v1.AuthorOuterClass.ListAuthorsResponse>(
                service, METHODID_LIST_AUTHORS)))
        .build();
  }

  private static abstract class AuthorServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    AuthorServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return org.noxhalley.contracts.author.v1.AuthorOuterClass.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("AuthorService");
    }
  }

  private static final class AuthorServiceFileDescriptorSupplier
      extends AuthorServiceBaseDescriptorSupplier {
    AuthorServiceFileDescriptorSupplier() {}
  }

  private static final class AuthorServiceMethodDescriptorSupplier
      extends AuthorServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final java.lang.String methodName;

    AuthorServiceMethodDescriptorSupplier(java.lang.String methodName) {
      this.methodName = methodName;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.MethodDescriptor getMethodDescriptor() {
      return getServiceDescriptor().findMethodByName(methodName);
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (AuthorServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new AuthorServiceFileDescriptorSupplier())
              .addMethod(getGetAuthorMethod())
              .addMethod(getListAuthorsMethod())
              .build();
        }
      }
    }
    return result;
  }
}
