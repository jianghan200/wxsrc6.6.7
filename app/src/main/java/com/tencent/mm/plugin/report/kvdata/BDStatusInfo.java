package com.tencent.mm.plugin.report.kvdata;

import java.util.LinkedList;

public class BDStatusInfo
  extends com.tencent.mm.bk.a
{
  public long favDBSize_;
  public long mmDBSize_;
  public int mmDBTableCount_;
  public long snsDBSize_;
  public LinkedList<TableInfo> tableList_ = new LinkedList();
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    if (paramInt == 0)
    {
      paramVarArgs = (f.a.a.c.a)paramVarArgs[0];
      paramVarArgs.T(1, this.mmDBSize_);
      paramVarArgs.T(2, this.snsDBSize_);
      paramVarArgs.fT(3, this.mmDBTableCount_);
      paramVarArgs.d(4, 8, this.tableList_);
      paramVarArgs.T(5, this.favDBSize_);
      return 0;
    }
    if (paramInt == 1) {
      return f.a.a.a.S(1, this.mmDBSize_) + 0 + f.a.a.a.S(2, this.snsDBSize_) + f.a.a.a.fQ(3, this.mmDBTableCount_) + f.a.a.a.c(4, 8, this.tableList_) + f.a.a.a.S(5, this.favDBSize_);
    }
    if (paramInt == 2)
    {
      paramVarArgs = (byte[])paramVarArgs[0];
      this.tableList_.clear();
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
      BDStatusInfo localBDStatusInfo = (BDStatusInfo)paramVarArgs[1];
      paramInt = ((Integer)paramVarArgs[2]).intValue();
      switch (paramInt)
      {
      default: 
        return -1;
      case 1: 
        localBDStatusInfo.mmDBSize_ = ((f.a.a.a.a)localObject1).vHC.rZ();
        return 0;
      case 2: 
        localBDStatusInfo.snsDBSize_ = ((f.a.a.a.a)localObject1).vHC.rZ();
        return 0;
      case 3: 
        localBDStatusInfo.mmDBTableCount_ = ((f.a.a.a.a)localObject1).vHC.rY();
        return 0;
      case 4: 
        paramVarArgs = ((f.a.a.a.a)localObject1).IC(paramInt);
        int i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          Object localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new TableInfo();
          localObject2 = new f.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (boolean bool = true; bool; bool = ((TableInfo)localObject1).a((f.a.a.a.a)localObject2, (com.tencent.mm.bk.a)localObject1, com.tencent.mm.bk.a.a((f.a.a.a.a)localObject2))) {}
          localBDStatusInfo.tableList_.add(localObject1);
          paramInt += 1;
        }
        return 0;
      }
      localBDStatusInfo.favDBSize_ = ((f.a.a.a.a)localObject1).vHC.rZ();
      return 0;
    }
    return -1;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/tencent/mm/plugin/report/kvdata/BDStatusInfo.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */