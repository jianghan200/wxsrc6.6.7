package com.tencent.mm.plugin.monitor;

import java.util.ArrayList;

public abstract interface a
{
  public abstract void a(int paramInt, a parama);
  
  public static final class a
  {
    int axZ;
    boolean dZm = false;
    long fileLenInvalidCount;
    long gTK;
    final String lrB;
    long lrC;
    long lrD;
    long lrE;
    ArrayList<a.b> lrF = new ArrayList(20);
    ArrayList<a.c> lrG = new ArrayList(20);
    
    a(String paramString)
    {
      this.lrB = paramString;
    }
    
    public final String toString()
    {
      return String.format("FileResult hash(%d) root[%s], canceled[%b], dirCount[%d], fileCount[%d], totalSize[%d], fileLenInvalidCount[%d], subDirResult[%d], tempAccDirResult[%d], totalTime[%d], depth[%d]", new Object[] { Integer.valueOf(hashCode()), this.lrB, Boolean.valueOf(this.dZm), Long.valueOf(this.lrC), Long.valueOf(this.lrD), Long.valueOf(this.gTK), Long.valueOf(this.fileLenInvalidCount), Integer.valueOf(this.lrF.size()), Integer.valueOf(this.lrG.size()), Long.valueOf(this.lrE), Integer.valueOf(this.axZ) });
    }
  }
  
  public static final class b
  {
    boolean dZm = false;
    long fileLenInvalidCount;
    long gTK;
    final String lrB;
    long lrC;
    long lrD;
    final int tag;
    
    b(String paramString, int paramInt)
    {
      this.lrB = paramString;
      this.tag = paramInt;
    }
    
    public final String toString()
    {
      return String.format("SubDirResult hash(%d) root[%d][%s], canceled[%b], dirCount[%d], fileCount[%d], totalSize[%d], fileLenInvalidCount[%d]", new Object[] { Integer.valueOf(hashCode()), Integer.valueOf(this.tag), this.lrB, Boolean.valueOf(this.dZm), Long.valueOf(this.lrC), Long.valueOf(this.lrD), Long.valueOf(this.gTK), Long.valueOf(this.fileLenInvalidCount) });
    }
  }
  
  public static final class c
  {
    boolean dZm = false;
    long gTK;
    final String lrB;
    long lrC;
    long lrD;
    long lrH;
    
    c(String paramString)
    {
      this.lrB = paramString;
    }
    
    public final String toString()
    {
      return String.format("TempAccDirResult hash(%d) root[%s], canceled[%b], dirCount[%d], fileCount[%d], totalSize[%d], fileLenInvaildCount[%d]", new Object[] { Integer.valueOf(hashCode()), this.lrB, Boolean.valueOf(this.dZm), Long.valueOf(this.lrC), Long.valueOf(this.lrD), Long.valueOf(this.gTK), Long.valueOf(this.lrH) });
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/plugin/monitor/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */