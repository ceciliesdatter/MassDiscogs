
import java.io.*;
import java.util.Properties;
import java.nio.file.*;
import java.util.Scanner;


public class ConfigSettings {
    Object title;
    Object artist;
    Object type;
    Object format;
    Object country;
    Object query;
    Object release_title;
    Object credit;
    Object anv;
    Object label;
    Object genre;
    Object style;
    int year;
    Object catno;
    Object barcode;
    Object track;
    Object submitter;
    Object contributor;

    public ConfigSettings() {
        this.title = "";
        this.artist = "";
        this.type = "";
        this.format = "";
        this.country = "";
        this.query = "";
        this.release_title = "";
        this.credit = "";
        this.anv = "";
        this.label = "";
        this.genre = "";
        this.style = "";
        this.catno = "";
        this.barcode = "";
        this.track = "";
        this.submitter = "";
        this.contributor = "";
    }

    public ConfigSettings(Properties config) {
        this.title = config.get("title");
        this.artist = config.get("artist");
        this.type = config.get("type");
        this.format = config.get("format");
        this.country = config.get("country");
        this.query = config.get("get");
        this.release_title = config.get("release_title");
        this.credit = config.get("credit");
        this.anv = config.get("anv");
        this.label = config.get("label");
        this.genre = config.get("genre");
        this.style = config.get("style");
        this.catno = config.get("catno");
        this.barcode = config.get("barcode");
        this.track = config.get("track");
        this.submitter = config.get("submitter");
        this.contributor = config.get("contributor");
    }

    public void loadConfigsFromFile(File input) throws IOException{
//       String settings = "./settings.properties"
       Properties props = new Properties();
       try {
           FileInputStream stream = new FileInputStream(input);
           props.load(stream);
           new ConfigSettings(props);
       }
       catch (IOException i){
           System.out.println(i);
       }
    }

    // Title getter and setter
    public Object getTitle(){
        return title;
    }
    public void setTitle(Object title){
        this.title = title;
    }

    
    // Artist getter and setter
    public Object getArtist(){
        return artist;
    }
    public void setArtist(Object artist){
        this.artist = artist;
    }

    
    // Type getter and setter
    public Object getType(){
        return type;
    }
    public void setType(Object type){
        this.type = type;
    }
    

    // Format getter and setter
    public Object getFormat(){
        return format;
    }
    public void setFormat(Object format){
        this.format = format;
    }

    
    // Country getter and setter
    public Object getCountry(){
        return country;
    }
    public void setCountry(Object country){
        this.country = country;
    }
    
    
    // Query getter and setter
    public Object getQuery(){
        return query;
    }
    public void setQuery(Object query){
        this.query = query;
    }
    
    
    // Release title getter and setter
    public Object getRelease_title(){
        return release_title ;
    }
    public void setRelease_title(Object release_title){
        this.release_title = release_title ;
    }

    
    // Credit getter and setter
    public void setCredit(Object credit){
        this.credit = credit ;
    }
    public Object getCredit(){
        return credit ;
    }
    
    
    // ANV getter and setter
    public Object getAnv(){
        return anv;
    }
    public void setAnv(Object anv){
        this.anv = anv;
    }
    
    
    // Label getter and setter
    public Object getLabel(){
            return label;
    }
    public void setLabel(Object label){
        this.label = label;
    }

    
    // Genre getter and setter
    public Object getGenre(){
        return genre;
    }
    public void setGenre(Object genre){
        this.genre = genre;
    }


    // Style getter and setter
    public Object getStyle(){
        return style;
    }
    public void setStyle(Object style){
        this.style = style;
    }


    // Year getter and setter
    public int getYear(){
        return year;    
    }
    public void setYear(int year){
        this.year = year;    
    }
    
    
    // Catalog Number getter and setter
    public Object getCatno(){
        return catno;
    }
    public void setCatno(Object catno){
        this.catno = catno;
    }
    
    
    // Barcode getter and setter
    public Object getBarcode(){
            return barcode;
        }
    public void setBarcode(Object barcode){
        this.barcode = barcode;
    }
    
    
    // Track getter and setter
    public Object getTrack(){
        return track;
    }
    public void setTrack(Object track){
        this.track = track;
    }
    
    
    // Submitter getter and setter
    public Object getSubmitter(){
        return submitter;
    }
    public void setSubmitter(Object submitter){
        this.submitter = submitter;
    }

    
    // Contributor getter and setter
    public Object getContributor(){
        return contributor;
    }
    public void setContributor(Object contributor){
        this.contributor = contributor;
    }

}

// Open csv file

// read and locally store config settings

// read first line

// search 