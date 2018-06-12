package com.tencent.mm.protocal.c;

public final class bon
  extends com.tencent.mm.bk.a
{
  public int hcE;
  public String jSA;
  public int lOH;
  public String rTW;
  public int rXs;
  public String rdS;
  public int rdq;
  public String smB;
  public int smg;
  public int smh;
  public int smi;
  public long smj;
  public long smk;
  public int smm;
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    if (paramInt == 0)
    {
      paramVarArgs = (f.a.a.c.a)paramVarArgs[0];
      if (this.rdS != null) {
        paramVarArgs.g(1, this.rdS);
      }
      if (this.rTW != null) {
        paramVarArgs.g(2, this.rTW);
      }
      paramVarArgs.fT(3, this.rdq);
      paramVarArgs.fT(4, this.hcE);
      if (this.jSA != null) {
        paramVarArgs.g(5, this.jSA);
      }
      paramVarArgs.fT(6, this.lOH);
      paramVarArgs.fT(7, this.smh);
      paramVarArgs.fT(8, this.smg);
      if (this.smB != null) {
        paramVarArgs.g(9, this.smB);
      }
      paramVarArgs.fT(10, this.smi);
      paramVarArgs.T(11, this.smj);
      paramVarArgs.T(12, this.smk);
      paramVarArgs.fT(13, this.rXs);
      paramVarArgs.fT(14, this.smm);
      return 0;
    }
    if (paramInt == 1) {
      if (this.rdS == null) {
        break label734;
      }
    }
    label734:
    for (paramInt = f.a.a.b.b.a.h(1, this.rdS) + 0;; paramInt = 0)
    {
      int i = paramInt;
      if (this.rTW != null) {
        i = paramInt + f.a.a.b.b.a.h(2, this.rTW);
      }
      i = i + f.a.a.a.fQ(3, this.rdq) + f.a.a.a.fQ(4, this.hcE);
      paramInt = i;
      if (this.jSA != null) {
        paramInt = i + f.a.a.b.b.a.h(5, this.jSA);
      }
      i = paramInt + f.a.a.a.fQ(6, this.lOH) + f.a.a.a.fQ(7, this.smh) + f.a.a.a.fQ(8, this.smg);
      paramInt = i;
      if (this.smB != null) {
        paramInt = i + f.a.a.b.b.a.h(9, this.smB);
      }
      return paramInt + f.a.a.a.fQ(10, this.smi) + f.a.a.a.S(11, this.smj) + f.a.a.a.S(12, this.smk) + f.a.a.a.fQ(13, this.rXs) + f.a.a.a.fQ(14, this.smm);
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
        bon localbon = (bon)paramVarArgs[1];
        switch (((Integer)paramVarArgs[2]).intValue())
        {
        default: 
          return -1;
        case 1: 
          localbon.rdS = locala.vHC.readString();
          return 0;
        case 2: 
          localbon.rTW = locala.vHC.readString();
          return 0;
        case 3: 
          localbon.rdq = locala.vHC.rY();
          return 0;
        case 4: 
          localbon.hcE = locala.vHC.rY();
          return 0;
        case 5: 
          localbon.jSA = locala.vHC.readString();
          return 0;
        case 6: 
          localbon.lOH = locala.vHC.rY();
          return 0;
        case 7: 
          localbon.smh = locala.vHC.rY();
          return 0;
        case 8: 
          localbon.smg = locala.vHC.rY();
          return 0;
        case 9: 
          localbon.smB = locala.vHC.readString();
          return 0;
        case 10: 
          localbon.smi = locala.vHC.rY();
          return 0;
        case 11: 
          localbon.smj = locala.vHC.rZ();
          return 0;
        case 12: 
          localbon.smk = locala.vHC.rZ();
          return 0;
        case 13: 
          localbon.rXs = locala.vHC.rY();
          return 0;
        }
        localbon.smm = locala.vHC.rY();
        return 0;
      }
      return -1;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/tencent/mm/protocal/c/bon.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */