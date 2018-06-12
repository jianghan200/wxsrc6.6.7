package com.tencent.qqmusic.mediaplayer.upstream;

import com.tencent.qqmusic.mediaplayer.AudioFormat.AudioType;
import com.tencent.qqmusic.mediaplayer.AudioRecognition;
import java.io.RandomAccessFile;

public class FileDataSource
  implements IDataSource
{
  private long currentPosition;
  private final String filePath;
  private boolean opened;
  private RandomAccessFile randomAccessFile;
  
  public FileDataSource(String paramString)
  {
    this.filePath = paramString;
  }
  
  public void close()
  {
    if (!this.opened) {
      return;
    }
    if (this.randomAccessFile != null) {
      this.randomAccessFile.close();
    }
    this.opened = false;
  }
  
  public AudioFormat.AudioType getAudioType()
  {
    return AudioRecognition.recognitionAudioFormatExactly(this.filePath);
  }
  
  public long getSize()
  {
    return this.randomAccessFile.length();
  }
  
  public void open()
  {
    if (this.opened) {
      return;
    }
    this.opened = true;
    this.randomAccessFile = new RandomAccessFile(this.filePath, "r");
    this.currentPosition = 0L;
  }
  
  public int readAt(long paramLong, byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    if (this.currentPosition != paramLong)
    {
      this.randomAccessFile.seek(paramLong);
      this.currentPosition = paramLong;
    }
    paramInt1 = this.randomAccessFile.read(paramArrayOfByte, paramInt1, paramInt2);
    if (paramInt1 >= 0) {
      this.currentPosition += paramInt1;
    }
    return paramInt1;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/qqmusic/mediaplayer/upstream/FileDataSource.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */