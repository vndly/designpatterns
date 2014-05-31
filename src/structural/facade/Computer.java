package structural.facade;

public class Computer
{
	private final CPU processor;
	private final Memory memory;
	private final HardDrive hardDrive;
	
	public Computer()
	{
		this.processor = new CPU();
		this.memory = new Memory();
		this.hardDrive = new HardDrive();
	}
	
	public void start()
	{
		long BOOT_ADDRESS = 0x12344321;
		long BOOT_SECTOR = 0x12345678;
		int SECTOR_SIZE = 1024;
		
		this.processor.start();
		this.memory.load(BOOT_ADDRESS, this.hardDrive.read(BOOT_SECTOR, SECTOR_SIZE));
		this.processor.jump(BOOT_ADDRESS);
		this.processor.execute();
	}
}