package com.example.designpatterns.bridgePattern.abstractPart;

import com.example.designpatterns.bridgePattern.concreteImp.TVFactory;

public class SpecialRemote extends RemoteControl {
	public SpecialRemote(TVFactory tvFactory) {
		super(tvFactory);
	}
	public void up() {
		int channel = this.getChannel();
		this.setChannel(channel+1);
	}
	public void down() {
		int channel = this.getChannel();
		this.setChannel(channel-1);
	}
}
