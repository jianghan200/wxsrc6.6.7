package com.tencent.mm.plugin.report.kvdata;

public class SubDirInfo
  extends com.tencent.mm.bk.a
{
  public long dirCount_;
  public long fileCount_;
  public long fileLenInvalidCount;
  public int tag_;
  public long totalSize_;
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    if (paramInt == 0)
    {
      paramVarArgs = (f.a.a.c.a)paramVarArgs[0];
      paramVarArgs.fT(1, this.tag_);
      paramVarArgs.T(2, this.totalSize_);
      paramVarArgs.T(3, this.dirCount_);
      paramVarArgs.T(4, this.fileCount_);
      paramVarArgs.T(5, this.fileLenInvalidCount);
      return 0;
    }
    if (paramInt == 1) {
      return f.a.a.a.fQ(1, this.tag_) + 0 + f.a.a.a.S(2, this.totalSize_) + f.a.a.a.S(3, this.dirCount_) + f.a.a.a.S(4, this.fileCount_) + f.a.a.a.S(5, this.fileLenInvalidCount);
    }
    if (paramInt == 2)
    {
      paramVarArgs = new f.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
      for (paramInt = com.tencent.mm.bk.a.a(paramVarArgs); paramInt > 0; paramInt = com.tencent.mm.bk.a.a(paramVarArgs)) {
        if (!super.a(paramVarArgs, this, paramInt)) {
          paramVarArgs.cJS();
        }
      }
      return 0;
    }
    if (paramInt == 3)
    {
      f.a.a.a.a locala = (f.a.a.a.a)paramVarArgs[0];
      SubDirInfo localSubDirInfo = (SubDirInfo)paramVarArgs[1];
      switch (((Integer)paramVarArgs[2]).intValue())
      {
      default: 
        return -1;
      case 1: 
        localSubDirInfo.tag_ = locala.vHC.rY();
        return 0;
      case 2: 
        localSubDirInfo.totalSize_ = locala.vHC.rZ();
        return 0;
      case 3: 
        localSubDirInfo.dirCount_ = locala.vHC.rZ();
        return 0;
      case 4: 
        localSubDirInfo.fileCount_ = locala.vHC.rZ();
        return 0;
      }
      localSubDirInfo.fileLenInvalidCount = locala.vHC.rZ();
      return 0;
    }
    return -1;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/plugin/report/kvdata/SubDirInfo.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */