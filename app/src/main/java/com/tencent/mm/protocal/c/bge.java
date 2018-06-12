package com.tencent.mm.protocal.c;

import com.tencent.mm.bk.b;

public final class bge
  extends com.tencent.mm.bk.a
{
  public int hcE;
  public int ixe;
  public b rvr;
  public int sdX;
  public String shm;
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    if (paramInt == 0)
    {
      paramVarArgs = (f.a.a.c.a)paramVarArgs[0];
      if (this.shm != null) {
        paramVarArgs.g(1, this.shm);
      }
      paramVarArgs.fT(2, this.hcE);
      paramVarArgs.fT(3, this.ixe);
      paramVarArgs.fT(4, this.sdX);
      if (this.rvr != null) {
        paramVarArgs.b(5, this.rvr);
      }
      return 0;
    }
    if (paramInt == 1) {
      if (this.shm == null) {
        break label344;
      }
    }
    label344:
    for (paramInt = f.a.a.b.b.a.h(1, this.shm) + 0;; paramInt = 0)
    {
      int i = paramInt + f.a.a.a.fQ(2, this.hcE) + f.a.a.a.fQ(3, this.ixe) + f.a.a.a.fQ(4, this.sdX);
      paramInt = i;
      if (this.rvr != null) {
        paramInt = i + f.a.a.a.a(5, this.rvr);
      }
      return paramInt;
      if (paramInt == 2)
      {
        paramVarArgs = new f.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
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
        bge localbge = (bge)paramVarArgs[1];
        switch (((Integer)paramVarArgs[2]).intValue())
        {
        default: 
          return -1;
        case 1: 
          localbge.shm = locala.vHC.readString();
          return 0;
        case 2: 
          localbge.hcE = locala.vHC.rY();
          return 0;
        case 3: 
          localbge.ixe = locala.vHC.rY();
          return 0;
        case 4: 
          localbge.sdX = locala.vHC.rY();
          return 0;
        }
        localbge.rvr = locala.cJR();
        return 0;
      }
      return -1;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/protocal/c/bge.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */