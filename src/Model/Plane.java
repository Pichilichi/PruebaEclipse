package Model;

public class Plane {

	private String Country,Manufacturer,Length,Height,Name,Nickname;
	private int Year,MaxSpeed;
	private float Weight,MaxWeight;
	private boolean Operating;
	
	public Plane(String country, String manufacturer, String length, String height, String name, String nickname, float weight, float maxWeight, int year,
			int maxSpeed, boolean operating) {
		this.Country = country;
		this.Manufacturer = manufacturer;
		this.Length = length;
		this.Height = height;
		this.Name = name;
		this.Nickname = nickname;
		this.Year = year;
		this.MaxSpeed = maxSpeed;
		this.Weight = weight;
		this.MaxWeight = maxWeight;
		this.Operating = operating;
	}

	public String getCountry() {
		return Country;
	}

	public void setCountry(String country) {
		Country = country;
	}

	public String getManufacturer() {
		return Manufacturer;
	}

	public void setManufacturer(String manufacturer) {
		Manufacturer = manufacturer;
	}

	public String getLength() {
		return Length;
	}

	public void setLength(String length) {
		Length = length;
	}

	public String getHeight() {
		return Height;
	}

	public void setHeight(String height) {
		Height = height;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public String getNickname() {
		return Nickname;
	}

	public void setNickname(String nickname) {
		Nickname = nickname;
	}

	public int getYear() {
		return Year;
	}

	public void setYear(int year) {
		Year = year;
	}

	public int getMaxSpeed() {
		return MaxSpeed;
	}

	public void setMaxSpeed(int maxSpeed) {
		MaxSpeed = maxSpeed;
	}

	public float getWeight() {
		return Weight;
	}

	public void setWeight(float weight) {
		Weight = weight;
	}

	public float getMaxWeight() {
		return MaxWeight;
	}

	public void setMaxWeight(float maxWeight) {
		MaxWeight = maxWeight;
	}

	public boolean getOperating(){
		return Operating;
	}

	public void setOperating(boolean operating){
		Operating = operating;
	}

	@Override
	public String toString() {
		return Name + ", " + Nickname + " - [Country=" + Country + ", Manufacturer=" + Manufacturer + ", Length=" + Length + ", Height="
				+ Height + ", Weight=" + Weight + ", MaxWeight=" + MaxWeight + ", Year=" + Year + ", MaxSpeed=" + MaxSpeed + ", Still working=" + Operating +  "]";
	}
	
	
	
	
}
