package action;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.util.Random;

import javax.imageio.ImageIO;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionSupport;

public class codeAction extends ActionSupport {
	private ByteArrayInputStream inputStream;

	public ByteArrayInputStream getInputStream() {
		return inputStream;
	}

	public void setInputStream(ByteArrayInputStream inputStream) {
		this.inputStream = inputStream;
	}

	@Override
	public String execute() throws Exception {

		HttpServletRequest request = ServletActionContext.getRequest();
		HttpServletResponse response = ServletActionContext.getResponse();

		response.setContentType("text/html;charset=utf-8");
		BufferedImage bi = new BufferedImage(80, 35, BufferedImage.TYPE_INT_RGB);//68,22
		Graphics g = bi.getGraphics();
		g.setColor(new Color(200, 150, 255));
		g.fillRect(0, 0, 80, 35);
		char[] cs = "ABCDEFGHIJKLNMOPQRSTUVWXYZ1234567890".toCharArray();
		int index = 0;
		int length = cs.length;
		Random ran = new Random();
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < 4; i++) {
			index = ran.nextInt(length);
			g.setColor(new Color(ran.nextInt(88), ran.nextInt(188), ran.nextInt(255)));
			g.drawString(cs[index] + "", i * 15 + 3, 18);
			sb.append(cs[index]);
		}
		String code = sb.toString();
		ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
		ImageIO.write(bi, "jpeg", outputStream);
		ByteArrayInputStream input = new ByteArrayInputStream(outputStream.toByteArray());
		this.setInputStream(input);
		request.getSession().setAttribute("servercode", code);
		// ¹Ø±ÕÁ÷

		return SUCCESS;
	}
	
	

}
