 DVD [] dvdcollection= new DVD[15];
 public class DVD{
      public string name ;
     public int releasedyear;
     public string  director;
}
 public DVD( string name , int releasedyear, string director){ 
 this.name= name;
 this.releasedyear=releasedyear;
this.director=director;
}
 public string tostring(){
  return this.name + " is directed by "+ this.director +" released in  "+this.releasedyear;
}
 DVD avengersDVD = new  DVD("The Avangers", 2012,"joss Whedon");
 
dvdcollection[7]= avengersDVD;
DVD incrediblesDVD = new DVD("The Incredibles", 2004, "Brad Bird");
DVD findingDoryDVD = new DVD("Finding Dory", 2016, "Andrew Stanton");
DVD lionKingDVD = new DVD("The Lion King", 2019, "Jon Favreau");
dvdCollection[3] = incrediblesDVD;
dvdCollection[9]=Finding Dory;
dvdCollection[2]=The Lion King;
System.out.println(dvdCollection[7]);
System.out.println(dvdCollection[10]);
System.out.println(dvdCollection[3]);
System.out.println(dvdCollection[9]);

  