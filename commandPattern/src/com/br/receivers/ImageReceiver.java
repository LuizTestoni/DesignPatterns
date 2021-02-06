package com.br.receivers;

public class ImageReceiver {
	
	private Boolean isBlackAndWhite;
	private Boolean isSepia;
	private Boolean isResized;
	
	public ImageReceiver() {
		this.isBlackAndWhite = false;
		this.isSepia = false;
		this.isResized = false;
	}
	
	public void setIsBlackAndWhite(Boolean isBlackAndWhite) {
		this.isBlackAndWhite = isBlackAndWhite;
	}
	public void setIsSepia(Boolean isSepia) {
		this.isSepia = isSepia;
	}
	public void setIsResized(Boolean isResized) {
		this.isResized = isResized;
	}
}
