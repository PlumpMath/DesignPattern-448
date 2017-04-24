package com.notrace.facade;

public class Computer {
	CPU cpu=new CPU();
	Memory memory=new Memory();
	HardDrive hardDrive=new HardDrive();
	
	public void startComputer(){
		cpu.freeze();
		memory.load(0, hardDrive.read(0, 100));
		cpu.jump(0);
		cpu.execute();
	}

}
