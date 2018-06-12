package com.tencent.mm.protocal.c;

public final class beq
  extends com.tencent.mm.bk.a
{
  public String hbL;
  public String hcS;
  public String rEJ;
  public String rwN;
  public String ryZ;
  public int sdg;
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    if (paramInt == 0)
    {
      paramVarArgs = (f.a.a.c.a)paramVarArgs[0];
      if (this.hbL != null) {
        paramVarArgs.g(1, this.hbL);
      }
      paramVarArgs.fT(2, this.sdg);
      if (this.hcS != null) {
        paramVarArgs.g(3, this.hcS);
      }
      if (this.rwN != null) {
        paramVarArgs.g(4, this.rwN);
      }
      if (this.ryZ != null) {
        paramVarArgs.g(5, this.ryZ);
      }
      if (this.rEJ != null) {
        paramVarArgs.g(6, this.rEJ);
      }
      return 0;
    }
    if (paramInt == 1) {
      if (this.hbL == null) {
        break label438;
      }
    }
    label438:
    for (paramInt = f.a.a.b.b.a.h(1, this.hbL) + 0;; paramInt = 0)
    {
      int i = paramInt + f.a.a.a.fQ(2, this.sdg);
      paramInt = i;
      if (this.hcS != null) {
        paramInt = i + f.a.a.b.b.a.h(3, this.hcS);
      }
      i = paramInt;
      if (this.rwN != null) {
        i = paramInt + f.a.a.b.b.a.h(4, this.rwN);
      }
      paramInt = i;
      if (this.ryZ != null) {
        paramInt = i + f.a.a.b.b.a.h(5, this.ryZ);
      }
      i = paramInt;
      if (this.rEJ != null) {
        i = paramInt + f.a.a.b.b.a.h(6, this.rEJ);
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
        beq localbeq = (beq)paramVarArgs[1];
        switch (((Integer)paramVarArgs[2]).intValue())
        {
        default: 
          return -1;
        case 1: 
          localbeq.hbL = locala.vHC.readString();
          return 0;
        case 2: 
          localbeq.sdg = locala.vHC.rY();
          return 0;
        case 3: 
          localbeq.hcS = locala.vHC.readString();
          return 0;
        case 4: 
          localbeq.rwN = locala.vHC.readString();
          return 0;
        case 5: 
          localbeq.ryZ = locala.vHC.readString();
          return 0;
        }
        localbeq.rEJ = locala.vHC.readString();
        return 0;
      }
      return -1;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/protocal/c/beq.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */