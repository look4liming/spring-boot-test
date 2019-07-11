package lee.bright.netty.nettytest.echo;

import io.netty.bootstrap.ServerBootstrap;
import io.netty.channel.ChannelFuture;
import io.netty.channel.ChannelInitializer;
import io.netty.channel.EventLoopGroup;
import io.netty.channel.nio.NioEventLoopGroup;
import io.netty.channel.socket.SocketChannel;
import io.netty.channel.socket.nio.NioServerSocketChannel;

/**
 * @author Bright Lee
 */
public class EchoServer {
	
	public static final int PORT = 6666;
	
	private void start() throws Exception {
		//final EchoServerHandler handler = new EchoServerHandler();
		
		EventLoopGroup group = new NioEventLoopGroup();
		try {
			ServerBootstrap bootstrap = new ServerBootstrap();
			bootstrap.group(group);
			bootstrap.channel(NioServerSocketChannel.class);
			bootstrap.localAddress(PORT);
			bootstrap.childHandler(new ChannelInitializer<SocketChannel>() {
				public void initChannel(SocketChannel socketChannel) throws Exception {
					socketChannel.pipeline().addLast(new EchoServerHandler());
				}
			});
			ChannelFuture channelFuture = bootstrap.bind().sync();
			channelFuture.channel().closeFuture().sync();
		} finally {
			group.shutdownGracefully().sync();
		}
	}

	public static void main(String[] args) throws Exception {
		new EchoServer().start();
	}

}
