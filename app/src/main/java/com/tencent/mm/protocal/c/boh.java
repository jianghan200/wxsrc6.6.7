package com.tencent.mm.protocal.c;

import java.util.LinkedList;

public final class boh
  extends com.tencent.mm.bk.a
{
  public int hcE;
  public String jSA;
  public int lOH;
  public int rdq;
  public String rxF;
  public String seC;
  public String sme;
  public String smf;
  public int smg;
  public int smh;
  public int smi;
  public long smj;
  public long smk;
  public bhy sml;
  public int smm;
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    if (paramInt == 0)
    {
      paramVarArgs = (f.a.a.c.a)paramVarArgs[0];
      if (this.seC != null) {
        paramVarArgs.g(1, this.seC);
      }
      if (this.rxF != null) {
        paramVarArgs.g(2, this.rxF);
      }
      if (this.sme != null) {
        paramVarArgs.g(3, this.sme);
      }
      if (this.smf != null) {
        paramVarArgs.g(4, this.smf);
      }
      paramVarArgs.fT(5, this.hcE);
      paramVarArgs.fT(6, this.rdq);
      paramVarArgs.fT(7, this.lOH);
      if (this.jSA != null) {
        paramVarArgs.g(8, this.jSA);
      }
      paramVarArgs.fT(9, this.smg);
      paramVarArgs.fT(10, this.smh);
      paramVarArgs.fT(11, this.smi);
      paramVarArgs.T(12, this.smj);
      paramVarArgs.T(13, this.smk);
      if (this.sml != null)
      {
        paramVarArgs.fV(14, this.sml.boi());
        this.sml.a(paramVarArgs);
      }
      paramVarArgs.fT(15, this.smm);
      return 0;
    }
    if (paramInt == 1) {
      if (this.seC == null) {
        break label903;
      }
    }
    label903:
    for (int i = f.a.a.b.b.a.h(1, this.seC) + 0;; i = 0)
    {
      paramInt = i;
      if (this.rxF != null) {
        paramInt = i + f.a.a.b.b.a.h(2, this.rxF);
      }
      i = paramInt;
      if (this.sme != null) {
        i = paramInt + f.a.a.b.b.a.h(3, this.sme);
      }
      paramInt = i;
      if (this.smf != null) {
        paramInt = i + f.a.a.b.b.a.h(4, this.smf);
      }
      i = paramInt + f.a.a.a.fQ(5, this.hcE) + f.a.a.a.fQ(6, this.rdq) + f.a.a.a.fQ(7, this.lOH);
      paramInt = i;
      if (this.jSA != null) {
        paramInt = i + f.a.a.b.b.a.h(8, this.jSA);
      }
      i = paramInt + f.a.a.a.fQ(9, this.smg) + f.a.a.a.fQ(10, this.smh) + f.a.a.a.fQ(11, this.smi) + f.a.a.a.S(12, this.smj) + f.a.a.a.S(13, this.smk);
      paramInt = i;
      if (this.sml != null) {
        paramInt = i + f.a.a.a.fS(14, this.sml.boi());
      }
      return paramInt + f.a.a.a.fQ(15, this.smm);
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
        Object localObject1 = (f.a.a.a.a)paramVarArgs[0];
        boh localboh = (boh)paramVarArgs[1];
        paramInt = ((Integer)paramVarArgs[2]).intValue();
        switch (paramInt)
        {
        default: 
          return -1;
        case 1: 
          localboh.seC = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        case 2: 
          localboh.rxF = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        case 3: 
          localboh.sme = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        case 4: 
          localboh.smf = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        case 5: 
          localboh.hcE = ((f.a.a.a.a)localObject1).vHC.rY();
          return 0;
        case 6: 
          localboh.rdq = ((f.a.a.a.a)localObject1).vHC.rY();
          return 0;
        case 7: 
          localboh.lOH = ((f.a.a.a.a)localObject1).vHC.rY();
          return 0;
        case 8: 
          localboh.jSA = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        case 9: 
          localboh.smg = ((f.a.a.a.a)localObject1).vHC.rY();
          return 0;
        case 10: 
          localboh.smh = ((f.a.a.a.a)localObject1).vHC.rY();
          return 0;
        case 11: 
          localboh.smi = ((f.a.a.a.a)localObject1).vHC.rY();
          return 0;
        case 12: 
          localboh.smj = ((f.a.a.a.a)localObject1).vHC.rZ();
          return 0;
        case 13: 
          localboh.smk = ((f.a.a.a.a)localObject1).vHC.rZ();
          return 0;
        case 14: 
          paramVarArgs = ((f.a.a.a.a)localObject1).IC(paramInt);
          i = paramVarArgs.size();
          paramInt = 0;
          while (paramInt < i)
          {
            Object localObject2 = (byte[])paramVarArgs.get(paramInt);
            localObject1 = new bhy();
            localObject2 = new f.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (boolean bool = true; bool; bool = ((bhy)localObject1).a((f.a.a.a.a)localObject2, (com.tencent.mm.bk.a)localObject1, com.tencent.mm.bk.a.a((f.a.a.a.a)localObject2))) {}
            localboh.sml = ((bhy)localObject1);
            paramInt += 1;
          }
        }
        localboh.smm = ((f.a.a.a.a)localObject1).vHC.rY();
        return 0;
      }
      return -1;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/tencent/mm/protocal/c/boh.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */