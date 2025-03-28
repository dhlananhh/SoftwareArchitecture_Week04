package iuh.fit.se.designs.CommandPattern;

public class CloseFileCommand implements Command {
	private FileSystemReceiver fileSystem;

	public CloseFileCommand(FileSystemReceiver fs) {
		this.fileSystem = fs;
	}

	@Override
	public void execute() {
		this.fileSystem.closeFile();
	}
}
