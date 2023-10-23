package com.example.designpatterns.bridgePattern;

import com.example.designpatterns.bridgePattern.abstractPart.GenericRemote;
import com.example.designpatterns.bridgePattern.abstractPart.SpecialRemote;
import com.example.designpatterns.bridgePattern.concreteImp.TVFactory;

public class Client {
	public static void main(String[] args) {
		TVFactory tvFactory = new TVFactory();
		SpecialRemote remoteSony = new SpecialRemote(tvFactory);
		System.out.println("Connect your remote to the TV");
		remoteSony.setTV("Sony");
		remoteSony.on();
		remoteSony.up();
		remoteSony.down();
		remoteSony.off();
		
		GenericRemote remoteLG = new GenericRemote(tvFactory);
		System.out.println("Connect your remote to the TV");
		remoteLG.setTV("LG");
		remoteLG.on();
		remoteLG.nextChannel();
		remoteLG.prevChannel();
		remoteLG.off();
	}
}