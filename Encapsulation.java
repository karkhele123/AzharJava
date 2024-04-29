class MyInfo
{
	private String name , nativePlace, branch ;
   MyInfo(String name, String nativePlace , String branch)
   {
   	this.name = name ;
   	this.nativePlace=nativePlace;
   	this.branch=branch;
   }
   public String getName()
   {
   	return name;
   }
   public void setName(String updateName)
   {
   	name = updateName;
   }
   public String getNativePlace()
   {
   	return nativePlace;
   }
   public void setNativePlaceO(String updateNativePlace)
   {
   	nativePlace=updateNativePlace;
   }
   public String getBranch()
   {
   	return branch;
   }
   public void setBranch(String updateBranch)
   {
   	branch = updateBranch;
   }
}
class Encapsulation
{
	public static void main(String[] args) 
	{
		MyInfo obj = new MyInfo("Ramesh","pune", "Electrical");
		System.out.println(obj.getName());
		obj.setName("nouman");
		System.out.println(obj.getName());
		System.out.println(obj.getNativePlace());
		System.out.println(obj.getBranch());
	}
}