package com.tencent.qqmusic.mediaplayer.seektable.mpeg4.boxes;

import com.tencent.qqmusic.mediaplayer.seektable.Parsable;

public class Stsc
  extends FullBox
{
  int entryCount;
  int[] firstChunk;
  int[] sampleDescIndex;
  int[] samplesPerChunk;
  
  public int getEntryCount()
  {
    return this.entryCount;
  }
  
  public int[] getFirstChunk()
  {
    return this.firstChunk;
  }
  
  public int[] getSampleDescIndex()
  {
    return this.sampleDescIndex;
  }
  
  public int[] getSamplesPerChunk()
  {
    return this.samplesPerChunk;
  }
  
  public void parse(Parsable paramParsable, Box paramBox)
  {
    super.parse(paramParsable, paramBox);
    this.entryCount = paramParsable.readInt();
    this.firstChunk = new int[this.entryCount];
    this.samplesPerChunk = new int[this.entryCount];
    this.sampleDescIndex = new int[this.entryCount];
    paramParsable.readIntArrayInterleaved(this.entryCount, new int[][] { this.firstChunk, this.samplesPerChunk, this.sampleDescIndex });
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/qqmusic/mediaplayer/seektable/mpeg4/boxes/Stsc.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */