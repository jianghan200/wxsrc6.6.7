package com.tencent.mm.plugin.report.kvdata;

import f.a.a.b;

public class TableInfo
  extends com.tencent.mm.bk.a
{
  public long count_;
  public String name_;
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    if (paramInt == 0)
    {
      paramVarArgs = (f.a.a.c.a)paramVarArgs[0];
      if (this.name_ == null) {
        throw new b("Not all required fields were included: name_");
      }
      if (this.name_ != null) {
        paramVarArgs.g(1, this.name_);
      }
      paramVarArgs.T(2, this.count_);
      return 0;
    }
    if (paramInt == 1) {
      if (this.name_ == null) {
        break label244;
      }
    }
    label244:
    for (paramInt = f.a.a.b.b.a.h(1, this.name_) + 0;; paramInt = 0)
    {
      return paramInt + f.a.a.a.S(2, this.count_);
      if (paramInt == 2)
      {
        paramVarArgs = new f.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bk.a.a(paramVarArgs); paramInt > 0; paramInt = com.tencent.mm.bk.a.a(paramVarArgs)) {
          if (!super.a(paramVarArgs, this, paramInt)) {
            paramVarArgs.cJS();
          }
        }
        if (this.name_ != null) {
          break;
        }
        throw new b("Not all required fields were included: name_");
      }
      if (paramInt == 3)
      {
        f.a.a.a.a locala = (f.a.a.a.a)paramVarArgs[0];
        TableInfo localTableInfo = (TableInfo)paramVarArgs[1];
        switch (((Integer)paramVarArgs[2]).intValue())
        {
        default: 
          return -1;
        case 1: 
          localTableInfo.name_ = locala.vHC.readString();
          return 0;
        }
        localTableInfo.count_ = locala.vHC.rZ();
        return 0;
      }
      return -1;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/plugin/report/kvdata/TableInfo.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */