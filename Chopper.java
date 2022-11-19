public class Chopper
{
	private String color;
	private Engine engine;
	private ROCKET rocket;
	
	public Chopper(String color){
		this.color = color;
		engine = new Engine();
		rocket = new ROCKET();
		
	}
	public void setColor(String color){
		this.color = color;
	}
	public String Start(){
		return engine.startEngine();
	}
}

