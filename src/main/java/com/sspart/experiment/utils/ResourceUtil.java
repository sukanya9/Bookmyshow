package com.sspart.experiment.utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ResourceUtil {
	//public static String localprops = null;
	public static Properties props= null;
	public static InheritableThreadLocal<Properties> localprops = new InheritableThreadLocal<Properties>() {
		@Override
		public Properties initialValue(){
			Properties props= new Properties ();
			File locatorsFolder = new File("src/main/resource/locators");
			for(File eachLocatorFile : locatorsFolder.listFiles()){
				try{
					props.load(new FileInputStream(eachLocatorFile));
				}catch(FileNotFoundException e){
					e.printStackTrace();
				}catch(IOException e){
					e.printStackTrace();
				}
			}
			return props;
		}
	};
		
		public static Properties getProps(){
			return ResourceUtil.localprops.get();
			}
		public static String getProp(String locName){
			return ResourceUtil.localprops.get().getProperty(locName);
			}
			
	public void initiateLocators() throws FileNotFoundException, IOException {
	
		props = new Properties();
		//File file = new File("src/main/resources/locators/MyLocators.loc");
		//File locatorsFolder = new File("src/main/resource/locators");
		
//		for(File eachLocatorFile : locatorsFolder.listFiles()) {
//			props.load(new FileInputStream(eachLocatorFile));
//		}
		
		
	}
	//public static properties props=null;

	


	
}
