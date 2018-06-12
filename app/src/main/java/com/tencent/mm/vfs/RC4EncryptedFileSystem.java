package com.tencent.mm.vfs;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.security.GeneralSecurityException;
import javax.crypto.Cipher;
import javax.crypto.CipherInputStream;
import javax.crypto.CipherOutputStream;
import javax.crypto.spec.SecretKeySpec;

public class RC4EncryptedFileSystem
  extends FileBasedFileSystem
{
  public static final Parcelable.Creator<RC4EncryptedFileSystem> CREATOR = new Parcelable.Creator() {};
  private final SecretKeySpec uSm;
  
  private RC4EncryptedFileSystem(Parcel paramParcel)
  {
    super(paramParcel);
    int i = paramParcel.readInt();
    if ((i > 256) || (i < 0)) {
      throw new IllegalStateException("Invalid parcel");
    }
    byte[] arrayOfByte = new byte[i];
    paramParcel.readByteArray(arrayOfByte);
    this.uSm = new SecretKeySpec(arrayOfByte, "RC4");
  }
  
  public RC4EncryptedFileSystem(String paramString, byte[] paramArrayOfByte)
  {
    super(paramString);
    this.uSm = new SecretKeySpec(paramArrayOfByte, "RC4");
  }
  
  public final OutputStream mG(String paramString)
  {
    if (this.mReadOnly) {
      throw new IOException("Cannot open files for writing on read-only file systems");
    }
    String str = abM(paramString);
    if (str == null) {
      throw new IOException("Invalid path: " + paramString);
    }
    try
    {
      paramString = Cipher.getInstance("RC4");
      paramString.init(1, this.uSm);
      paramString = new CipherOutputStream(new FileOutputStream(str), paramString);
      return paramString;
    }
    catch (GeneralSecurityException paramString)
    {
      throw ((FileNotFoundException)new FileNotFoundException("Failed to initialize cipher: " + paramString.getMessage()).initCause(paramString));
    }
  }
  
  public final InputStream openRead(String paramString)
  {
    String str = abM(paramString);
    if (str == null) {
      throw new IOException("Invalid path: " + paramString);
    }
    try
    {
      paramString = Cipher.getInstance("RC4");
      paramString.init(2, this.uSm);
      paramString = new CipherInputStream(new FileInputStream(str), paramString);
      return paramString;
    }
    catch (GeneralSecurityException paramString)
    {
      throw ((FileNotFoundException)new FileNotFoundException("Failed to initialize cipher: " + paramString.getMessage()).initCause(paramString));
    }
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    super.writeToParcel(paramParcel, paramInt);
    byte[] arrayOfByte = this.uSm.getEncoded();
    paramParcel.writeInt(arrayOfByte.length);
    paramParcel.writeByteArray(arrayOfByte);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes-dex2jar.jar!/com/tencent/mm/vfs/RC4EncryptedFileSystem.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */