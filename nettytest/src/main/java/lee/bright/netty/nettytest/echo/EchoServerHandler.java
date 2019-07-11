package lee.bright.netty.nettytest.echo;

import java.util.concurrent.atomic.AtomicLong;

import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;
import io.netty.channel.ChannelFuture;
import io.netty.channel.ChannelFutureListener;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.ChannelInboundHandler;
import io.netty.channel.ChannelInboundHandlerAdapter;
import io.netty.util.CharsetUtil;

/**
 * @author Bright Lee
 */
public class EchoServerHandler extends ChannelInboundHandlerAdapter implements ChannelInboundHandler {
	
	private static final AtomicLong AL = new AtomicLong(0L);
	
	public EchoServerHandler() {
	}
	
	/**
	 * 对于每个传入的消息，Netty都会回调该方法。
	 */
	@Override
	public void channelRead(ChannelHandlerContext ctx, Object msg) {
		ByteBuf in = (ByteBuf) msg;
		long l = AL.incrementAndGet();
		System.out.println("服务器收到消息（" + l + "）：" + in.toString(CharsetUtil.UTF_8));
		// 将收到的消息回传给客户端：
		ctx.write(in);
	}
	
	@Override
	public void channelReadComplete(ChannelHandlerContext ctx) {
		// 将之前写入的消息一同刷给客户端：
		ChannelFuture channelFuture = ctx.writeAndFlush(Unpooled.EMPTY_BUFFER);
		// 关闭channel：
		channelFuture.addListener(ChannelFutureListener.CLOSE);
	}
	
	@Override
	public void exceptionCaught(ChannelHandlerContext ctx, Throwable cause) {
		// 打印异常信息：
		cause.printStackTrace();
		// 关闭channel：
		ctx.close();
	}

}
