package com.tencent.mm.plugin.report.kvdata;

import java.util.LinkedList;

public class WeChatSDInfo
  extends com.tencent.mm.bk.a
{
  public int depth_;
  public long dirCount_;
  public long fileCount_;
  public long fileLenInvalidCount_;
  public LinkedList<SubDirInfo> subDirList_ = new LinkedList();
  public int subDirResultsSize_;
  public long tempAccDirCount_;
  public int tempAccDirResultsSize_;
  public long tempAccFileCount_;
  public long tempAccFileLenInvalidCount_;
  public long tempAccTotalSize_;
  public long totalSize_;
  public long totalTime_;
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    if (paramInt == 0)
    {
      paramVarArgs = (f.a.a.c.a)paramVarArgs[0];
      paramVarArgs.T(1, this.totalSize_);
      paramVarArgs.T(2, this.dirCount_);
      paramVarArgs.T(3, this.fileCount_);
      paramVarArgs.T(4, this.fileLenInvalidCount_);
      paramVarArgs.fT(5, this.subDirResultsSize_);
      paramVarArgs.T(6, this.totalTime_);
      paramVarArgs.fT(7, this.depth_);
      paramVarArgs.T(8, this.tempAccTotalSize_);
      paramVarArgs.fT(9, this.tempAccDirResultsSize_);
      paramVarArgs.T(10, this.tempAccDirCount_);
      paramVarArgs.T(11, this.tempAccFileCount_);
      paramVarArgs.T(12, this.tempAccFileLenInvalidCount_);
      paramVarArgs.d(13, 8, this.subDirList_);
      return 0;
    }
    if (paramInt == 1) {
      return f.a.a.a.S(1, this.totalSize_) + 0 + f.a.a.a.S(2, this.dirCount_) + f.a.a.a.S(3, this.fileCount_) + f.a.a.a.S(4, this.fileLenInvalidCount_) + f.a.a.a.fQ(5, this.subDirResultsSize_) + f.a.a.a.S(6, this.totalTime_) + f.a.a.a.fQ(7, this.depth_) + f.a.a.a.S(8, this.tempAccTotalSize_) + f.a.a.a.fQ(9, this.tempAccDirResultsSize_) + f.a.a.a.S(10, this.tempAccDirCount_) + f.a.a.a.S(11, this.tempAccFileCount_) + f.a.a.a.S(12, this.tempAccFileLenInvalidCount_) + f.a.a.a.c(13, 8, this.subDirList_);
    }
    if (paramInt == 2)
    {
      paramVarArgs = (byte[])paramVarArgs[0];
      this.subDirList_.clear();
      paramVarArgs = new f.a.a.a.a(paramVarArgs, unknownTagHandler);
      for (paramInt = com.tencent.mm.bk.a.a(paramVarArgs); paramInt > 0; paramInt = com.tencent.mm.bk.a.a(paramVarArgs)) {
        if (!super.a(paramVarArgs, this, paramInt)) {
          paramVarArgs.cJS();
        }
      }
      return 0;
    }
    if (paramInt == 3)
    {
      Object localObject1 = (f.a.a.a.a)paramVarArgs[0];
      WeChatSDInfo localWeChatSDInfo = (WeChatSDInfo)paramVarArgs[1];
      paramInt = ((Integer)paramVarArgs[2]).intValue();
      switch (paramInt)
      {
      default: 
        return -1;
      case 1: 
        localWeChatSDInfo.totalSize_ = ((f.a.a.a.a)localObject1).vHC.rZ();
        return 0;
      case 2: 
        localWeChatSDInfo.dirCount_ = ((f.a.a.a.a)localObject1).vHC.rZ();
        return 0;
      case 3: 
        localWeChatSDInfo.fileCount_ = ((f.a.a.a.a)localObject1).vHC.rZ();
        return 0;
      case 4: 
        localWeChatSDInfo.fileLenInvalidCount_ = ((f.a.a.a.a)localObject1).vHC.rZ();
        return 0;
      case 5: 
        localWeChatSDInfo.subDirResultsSize_ = ((f.a.a.a.a)localObject1).vHC.rY();
        return 0;
      case 6: 
        localWeChatSDInfo.totalTime_ = ((f.a.a.a.a)localObject1).vHC.rZ();
        return 0;
      case 7: 
        localWeChatSDInfo.depth_ = ((f.a.a.a.a)localObject1).vHC.rY();
        return 0;
      case 8: 
        localWeChatSDInfo.tempAccTotalSize_ = ((f.a.a.a.a)localObject1).vHC.rZ();
        return 0;
      case 9: 
        localWeChatSDInfo.tempAccDirResultsSize_ = ((f.a.a.a.a)localObject1).vHC.rY();
        return 0;
      case 10: 
        localWeChatSDInfo.tempAccDirCount_ = ((f.a.a.a.a)localObject1).vHC.rZ();
        return 0;
      case 11: 
        localWeChatSDInfo.tempAccFileCount_ = ((f.a.a.a.a)localObject1).vHC.rZ();
        return 0;
      case 12: 
        localWeChatSDInfo.tempAccFileLenInvalidCount_ = ((f.a.a.a.a)localObject1).vHC.rZ();
        return 0;
      }
      paramVarArgs = ((f.a.a.a.a)localObject1).IC(paramInt);
      int i = paramVarArgs.size();
      paramInt = 0;
      while (paramInt < i)
      {
        Object localObject2 = (byte[])paramVarArgs.get(paramInt);
        localObject1 = new SubDirInfo();
        localObject2 = new f.a.a.a.a((byte[])localObject2, unknownTagHandler);
        for (boolean bool = true; bool; bool = ((SubDirInfo)localObject1).a((f.a.a.a.a)localObject2, (com.tencent.mm.bk.a)localObject1, com.tencent.mm.bk.a.a((f.a.a.a.a)localObject2))) {}
        localWeChatSDInfo.subDirList_.add(localObject1);
        paramInt += 1;
      }
      return 0;
    }
    return -1;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/plugin/report/kvdata/WeChatSDInfo.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */