package com.tencent.mm.protocal.c;

import com.tencent.mm.bk.b;

public final class btk
  extends com.tencent.mm.bk.a
{
  public b rkW;
  public int rkX;
  public int srh;
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    if (paramInt == 0)
    {
      paramVarArgs = (f.a.a.c.a)paramVarArgs[0];
      paramVarArgs.fT(7, this.srh);
      if (this.rkW != null) {
        paramVarArgs.b(8, this.rkW);
      }
      paramVarArgs.fT(9, this.rkX);
      return 0;
    }
    if (paramInt == 1)
    {
      int i = f.a.a.a.fQ(7, this.srh) + 0;
      paramInt = i;
      if (this.rkW != null) {
        paramInt = i + f.a.a.a.a(8, this.rkW);
      }
      return paramInt + f.a.a.a.fQ(9, this.rkX);
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
      btk localbtk = (btk)paramVarArgs[1];
      switch (((Integer)paramVarArgs[2]).intValue())
      {
      default: 
        return -1;
      case 7: 
        localbtk.srh = locala.vHC.rY();
        return 0;
      case 8: 
        localbtk.rkW = locala.cJR();
        return 0;
      }
      localbtk.rkX = locala.vHC.rY();
      return 0;
    }
    return -1;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/mm/protocal/c/btk.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */