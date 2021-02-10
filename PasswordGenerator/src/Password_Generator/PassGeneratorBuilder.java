/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Password_Generator;

/**
 *
 * @author Ahmed Shoeb
 */
public class PassGeneratorBuilder {
    public boolean useLower;
    public boolean useUpper;
    public boolean useDigits;
    public boolean usePunctuation;
    
    public PassGeneratorBuilder() {
            this.useLower = false;
            this.useUpper = false;
            this.useDigits = false;
            this.usePunctuation = false;
        }
    
     public PassGeneratorBuilder useLower(boolean useLower) {
            this.useLower = useLower;
            return this;
        }
     
     public PassGeneratorBuilder useUpper(boolean useUpper) {
            this.useUpper = useUpper;
            return this;}
     
     public PassGeneratorBuilder useDigits(boolean useDigits) {
            this.useDigits = useDigits;
            return this;
        }
     
      public PassGeneratorBuilder usePunctuation(boolean usePunctuation) {
            this.usePunctuation = usePunctuation;
            return this;
        }
      
      public PassGenerator build() {
         return new PassGenerator(this);
        }
     
       
    
    
}
