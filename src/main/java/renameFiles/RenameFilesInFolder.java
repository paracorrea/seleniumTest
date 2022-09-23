package renameFiles;
		import java.io.File;
		import java.io.IOException;



public class RenameFilesInFolder {

	    public static void main(String[] argv) throws IOException {
	    	int count = 1;
	    	 File dir = new File("c:\\Projects\\Samples");
	            if (dir.exists()) {
	                File[] files = dir.listFiles();
	                if (files.length > 0) {
	                    for (File file : files) {
	                        String f = file.getName();
	                        //String s = f.replaceAll("0|1|2|3|4|5|6|7|8|9|\\)|-|\\(", "").trim() + "3";
	                        //File oldName = new File("C:/program.txt");
	                      
							File newName = new File("C:\\Projects\\\\Samples\\NotaFiscal_00" + count+".pdf");
	                        if (file.renameTo(newName)) {
	                            System.out.println("OK");
	                        } else {
	                            System.out.println("Erro");
	                        }  
	                        count ++;
	                        System.out.println("C:\\Projects\\\\Samples\\NotaFiscal_00" + count+".pdf");
	                    }
	                  
	                } else {
	                    System.out.println("dir vazio");
	                }
	            } else {
	                System.out.println("dir não existe");
	            }
	        }
	    		
	    	
	    	/*
	    	Integer count = 1;
		        File folder = new File("c:\\Projects\\Samples");
		        File[] listOfFiles = folder.listFiles();
		        
		        List<File> files = new ArrayList<>();
		        
		        for (int i = 0; i < listOfFiles.length; i++) {

		            //if (listOfFiles[i].isFile()) {

		                File f = new File("c:\\Projects\\Samples\\"+listOfFiles[i].getName()); 

		                f.renameTo(new File("c:\\Projects\\Samples\\"+"notaFiscal00"+i+".pdf"));
		                
		                count += count;
		           // }
*/		        }
		        
		     //   System.out.println("conversion is done");
		  //  }
		
	
