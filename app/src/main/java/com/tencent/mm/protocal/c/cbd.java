package com.tencent.mm.protocal.c;

import com.tencent.mm.bk.b;

public final class cbd
  extends com.tencent.mm.bk.a
{
  public String fMk;
  public int nc;
  public b rwb;
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    int i;
    if (paramInt == 0)
    {
      paramVarArgs = (f.a.a.c.a)paramVarArgs[0];
      paramVarArgs.fT(1, this.nc);
      if (this.fMk != null) {
        paramVarArgs.g(2, this.fMk);
      }
      if (this.rwb != null) {
        paramVarArgs.b(3, this.rwb);
      }
      i = 0;
    }
    do
    {
      return i;
      if (paramInt != 1) {
        break;
      }
      i = f.a.a.a.fQ(1, this.nc) + 0;
      paramInt = i;
      if (this.fMk != null) {
        paramInt = i + f.a.a.b.b.a.h(2, this.fMk);
      }
      i = paramInt;
    } while (this.rwb == null);
    return paramInt + f.a.a.a.a(3, this.rwb);
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
      cbd localcbd = (cbd)paramVarArgs[1];
      switch (((Integer)paramVarArgs[2]).intValue())
      {
      default: 
        return -1;
      case 1: 
        localcbd.nc = locala.vHC.rY();
        return 0;
      case 2: 
        localcbd.fMk = locala.vHC.readString();
        return 0;
      }
      localcbd.rwb = locala.cJR();
      return 0;
    }
    return -1;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/protocal/c/cbd.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */