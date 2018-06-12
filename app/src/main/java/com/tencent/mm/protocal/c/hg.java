package com.tencent.mm.protocal.c;

import java.util.LinkedList;

public final class hg
  extends bhd
{
  public String hbL;
  public String iwP;
  public String reE;
  public String reS;
  public int rfe;
  public String rhA;
  public bhy rhB;
  public int rhC;
  public int rhD;
  public int rhE;
  public String rhF;
  public String rhu;
  public String rhv;
  public int rhw;
  public String rhx;
  public int rhy;
  public String rhz;
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    if (paramInt == 0)
    {
      paramVarArgs = (f.a.a.c.a)paramVarArgs[0];
      if (this.shX != null)
      {
        paramVarArgs.fV(1, this.shX.boi());
        this.shX.a(paramVarArgs);
      }
      if (this.hbL != null) {
        paramVarArgs.g(2, this.hbL);
      }
      if (this.rhu != null) {
        paramVarArgs.g(3, this.rhu);
      }
      paramVarArgs.fT(4, this.rfe);
      if (this.rhv != null) {
        paramVarArgs.g(5, this.rhv);
      }
      paramVarArgs.fT(6, this.rhw);
      if (this.rhx != null) {
        paramVarArgs.g(7, this.rhx);
      }
      if (this.reE != null) {
        paramVarArgs.g(8, this.reE);
      }
      paramVarArgs.fT(9, this.rhy);
      if (this.rhz != null) {
        paramVarArgs.g(10, this.rhz);
      }
      if (this.rhA != null) {
        paramVarArgs.g(11, this.rhA);
      }
      if (this.rhB != null)
      {
        paramVarArgs.fV(12, this.rhB.boi());
        this.rhB.a(paramVarArgs);
      }
      if (this.iwP != null) {
        paramVarArgs.g(13, this.iwP);
      }
      paramVarArgs.fT(14, this.rhC);
      paramVarArgs.fT(15, this.rhD);
      if (this.reS != null) {
        paramVarArgs.g(16, this.reS);
      }
      paramVarArgs.fT(17, this.rhE);
      if (this.rhF != null) {
        paramVarArgs.g(18, this.rhF);
      }
      return 0;
    }
    if (paramInt == 1) {
      if (this.shX == null) {
        break label1226;
      }
    }
    label1226:
    for (int i = f.a.a.a.fS(1, this.shX.boi()) + 0;; i = 0)
    {
      paramInt = i;
      if (this.hbL != null) {
        paramInt = i + f.a.a.b.b.a.h(2, this.hbL);
      }
      i = paramInt;
      if (this.rhu != null) {
        i = paramInt + f.a.a.b.b.a.h(3, this.rhu);
      }
      i += f.a.a.a.fQ(4, this.rfe);
      paramInt = i;
      if (this.rhv != null) {
        paramInt = i + f.a.a.b.b.a.h(5, this.rhv);
      }
      i = paramInt + f.a.a.a.fQ(6, this.rhw);
      paramInt = i;
      if (this.rhx != null) {
        paramInt = i + f.a.a.b.b.a.h(7, this.rhx);
      }
      i = paramInt;
      if (this.reE != null) {
        i = paramInt + f.a.a.b.b.a.h(8, this.reE);
      }
      i += f.a.a.a.fQ(9, this.rhy);
      paramInt = i;
      if (this.rhz != null) {
        paramInt = i + f.a.a.b.b.a.h(10, this.rhz);
      }
      i = paramInt;
      if (this.rhA != null) {
        i = paramInt + f.a.a.b.b.a.h(11, this.rhA);
      }
      paramInt = i;
      if (this.rhB != null) {
        paramInt = i + f.a.a.a.fS(12, this.rhB.boi());
      }
      i = paramInt;
      if (this.iwP != null) {
        i = paramInt + f.a.a.b.b.a.h(13, this.iwP);
      }
      i = i + f.a.a.a.fQ(14, this.rhC) + f.a.a.a.fQ(15, this.rhD);
      paramInt = i;
      if (this.reS != null) {
        paramInt = i + f.a.a.b.b.a.h(16, this.reS);
      }
      i = paramInt + f.a.a.a.fQ(17, this.rhE);
      paramInt = i;
      if (this.rhF != null) {
        paramInt = i + f.a.a.b.b.a.h(18, this.rhF);
      }
      return paramInt;
      if (paramInt == 2)
      {
        paramVarArgs = new f.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
        for (paramInt = bhd.a(paramVarArgs); paramInt > 0; paramInt = bhd.a(paramVarArgs)) {
          if (!super.a(paramVarArgs, this, paramInt)) {
            paramVarArgs.cJS();
          }
        }
        break;
      }
      if (paramInt == 3)
      {
        Object localObject1 = (f.a.a.a.a)paramVarArgs[0];
        hg localhg = (hg)paramVarArgs[1];
        paramInt = ((Integer)paramVarArgs[2]).intValue();
        Object localObject2;
        boolean bool;
        switch (paramInt)
        {
        default: 
          return -1;
        case 1: 
          paramVarArgs = ((f.a.a.a.a)localObject1).IC(paramInt);
          i = paramVarArgs.size();
          paramInt = 0;
          while (paramInt < i)
          {
            localObject2 = (byte[])paramVarArgs.get(paramInt);
            localObject1 = new fk();
            localObject2 = new f.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = ((fk)localObject1).a((f.a.a.a.a)localObject2, (com.tencent.mm.bk.a)localObject1, bhd.a((f.a.a.a.a)localObject2))) {}
            localhg.shX = ((fk)localObject1);
            paramInt += 1;
          }
        case 2: 
          localhg.hbL = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        case 3: 
          localhg.rhu = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        case 4: 
          localhg.rfe = ((f.a.a.a.a)localObject1).vHC.rY();
          return 0;
        case 5: 
          localhg.rhv = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        case 6: 
          localhg.rhw = ((f.a.a.a.a)localObject1).vHC.rY();
          return 0;
        case 7: 
          localhg.rhx = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        case 8: 
          localhg.reE = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        case 9: 
          localhg.rhy = ((f.a.a.a.a)localObject1).vHC.rY();
          return 0;
        case 10: 
          localhg.rhz = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        case 11: 
          localhg.rhA = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        case 12: 
          paramVarArgs = ((f.a.a.a.a)localObject1).IC(paramInt);
          i = paramVarArgs.size();
          paramInt = 0;
          while (paramInt < i)
          {
            localObject2 = (byte[])paramVarArgs.get(paramInt);
            localObject1 = new bhy();
            localObject2 = new f.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = ((bhy)localObject1).a((f.a.a.a.a)localObject2, (com.tencent.mm.bk.a)localObject1, bhd.a((f.a.a.a.a)localObject2))) {}
            localhg.rhB = ((bhy)localObject1);
            paramInt += 1;
          }
        case 13: 
          localhg.iwP = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        case 14: 
          localhg.rhC = ((f.a.a.a.a)localObject1).vHC.rY();
          return 0;
        case 15: 
          localhg.rhD = ((f.a.a.a.a)localObject1).vHC.rY();
          return 0;
        case 16: 
          localhg.reS = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        case 17: 
          localhg.rhE = ((f.a.a.a.a)localObject1).vHC.rY();
          return 0;
        }
        localhg.rhF = ((f.a.a.a.a)localObject1).vHC.readString();
        return 0;
      }
      return -1;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/mm/protocal/c/hg.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */