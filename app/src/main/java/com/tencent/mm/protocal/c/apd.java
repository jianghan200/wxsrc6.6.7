package com.tencent.mm.protocal.c;

import java.util.LinkedList;

public final class apd
  extends com.tencent.mm.bk.a
{
  public String mPl;
  public int rRm;
  public LinkedList<String> rRn = new LinkedList();
  public String scope;
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    if (paramInt == 0)
    {
      paramVarArgs = (f.a.a.c.a)paramVarArgs[0];
      if (this.scope != null) {
        paramVarArgs.g(1, this.scope);
      }
      paramVarArgs.fT(2, this.rRm);
      if (this.mPl != null) {
        paramVarArgs.g(3, this.mPl);
      }
      paramVarArgs.d(4, 1, this.rRn);
      return 0;
    }
    if (paramInt == 1) {
      if (this.scope == null) {
        break label324;
      }
    }
    label324:
    for (paramInt = f.a.a.b.b.a.h(1, this.scope) + 0;; paramInt = 0)
    {
      int i = paramInt + f.a.a.a.fQ(2, this.rRm);
      paramInt = i;
      if (this.mPl != null) {
        paramInt = i + f.a.a.b.b.a.h(3, this.mPl);
      }
      return paramInt + f.a.a.a.c(4, 1, this.rRn);
      if (paramInt == 2)
      {
        paramVarArgs = (byte[])paramVarArgs[0];
        this.rRn.clear();
        paramVarArgs = new f.a.a.a.a(paramVarArgs, unknownTagHandler);
        for (paramInt = com.tencent.mm.bk.a.a(paramVarArgs); paramInt > 0; paramInt = com.tencent.mm.bk.a.a(paramVarArgs)) {
          if (!super.a(paramVarArgs, this, paramInt)) {
            paramVarArgs.cJS();
          }
        }
        break;
      }
      if (paramInt == 3)
      {
        f.a.a.a.a locala = (f.a.a.a.a)paramVarArgs[0];
        apd localapd = (apd)paramVarArgs[1];
        switch (((Integer)paramVarArgs[2]).intValue())
        {
        default: 
          return -1;
        case 1: 
          localapd.scope = locala.vHC.readString();
          return 0;
        case 2: 
          localapd.rRm = locala.vHC.rY();
          return 0;
        case 3: 
          localapd.mPl = locala.vHC.readString();
          return 0;
        }
        localapd.rRn.add(locala.vHC.readString());
        return 0;
      }
      return -1;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/tencent/mm/protocal/c/apd.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */