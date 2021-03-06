package com.cars.messaging;

public class OutputMessage {

    private String from;
    private String text;
    private String time;

    public OutputMessage(final String from, final String text, final String time) {

        this.setFrom(from);
        this.setText(text);
        this.setTime(time);
    }

	public String getFrom() {
		return from;
	}

	public void setFrom(String from) {
		this.from = from;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	public String getTime() {
		return time;
	}

	public void setTime(String time) {
		this.time = time;
	}
}