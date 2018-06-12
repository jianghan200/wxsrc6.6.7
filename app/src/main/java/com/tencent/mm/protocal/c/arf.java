package com.tencent.mm.protocal.c;

public final class arf
  extends com.tencent.mm.bk.a
{
  public String hbL;
  public String hcS;
  public int hcd;
  public String mEl;
  public String rEJ;
  public String rqZ;
  public String rra;
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    if (paramInt == 0)
    {
      paramVarArgs = (f.a.a.c.a)paramVarArgs[0];
      if (this.mEl != null) {
        paramVarArgs.g(1, this.mEl);
      }
      if (this.hbL != null) {
        paramVarArgs.g(2, this.hbL);
      }
      paramVarArgs.fT(3, this.hcd);
      if (this.rqZ != null) {
        paramVarArgs.g(4, this.rqZ);
      }
      if (this.rra != null) {
        paramVarArgs.g(5, this.rra);
      }
      if (this.hcS != null) {
        paramVarArgs.g(6, this.hcS);
      }
      if (this.rEJ != null) {
        paramVarArgs.g(7, this.rEJ);
      }
      return 0;
    }
    if (paramInt == 1) {
      if (this.mEl == null) {
        break label497;
      }
    }
    label497:
    for (paramInt = f.a.a.b.b.a.h(1, this.mEl) + 0;; paramInt = 0)
    {
      int i = paramInt;
      if (this.hbL != null) {
        i = paramInt + f.a.a.b.b.a.h(2, this.hbL);
      }
      i += f.a.a.a.fQ(3, this.hcd);
      paramInt = i;
      if (this.rqZ != null) {
        paramInt = i + f.a.a.b.b.a.h(4, this.rqZ);
      }
      i = paramInt;
      if (this.rra != null) {
        i = paramInt + f.a.a.b.b.a.h(5, this.rra);
      }
      paramInt = i;
      if (this.hcS != null) {
        paramInt = i + f.a.a.b.b.a.h(6, this.hcS);
      }
      i = paramInt;
      if (this.rEJ != null) {
        i = paramInt + f.a.a.b.b.a.h(7, this.rEJ);
      }
      return i;
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
        arf localarf = (arf)paramVarArgs[1];
        switch (((Integer)paramVarArgs[2]).intValue())
        {
        default: 
          return -1;
        case 1: 
          localarf.mEl = locala.vHC.readString();
          return 0;
        case 2: 
          localarf.hbL = locala.vHC.readString();
          return 0;
        case 3: 
          localarf.hcd = locala.vHC.rY();
          return 0;
        case 4: 
          localarf.rqZ = locala.vHC.readString();
          return 0;
        case 5: 
          localarf.rra = locala.vHC.readString();
          return 0;
        case 6: 
          localarf.hcS = locala.vHC.readString();
          return 0;
        }
        localarf.rEJ = locala.vHC.readString();
        return 0;
      }
      return -1;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes7-dex2jar.jar!/com/tencent/mm/protocal/c/arf.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */