package iuh.fit.se.designs.CommandPattern;

public class OpenFileCommand implements Command {
	private FileSystemReceiver fileSystem;

	public OpenFileCommand(FileSystemReceiver fs) {
		this.fileSystem = fs;
	}

	@Override
	public void execute() {
		this.fileSystem.openFile();
	}
}
