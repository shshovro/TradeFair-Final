/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tradefair.user56;

import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.OutputStream;

public class AppendableObjectOutputStream extends ObjectOutputStream{
          public AppendableObjectOutputStream(OutputStream out) throws IOException
          {
              
            super(out);
          }
          @Override
          protected void writeStreamHeader() throws IOException{
              //todo
          }
}
