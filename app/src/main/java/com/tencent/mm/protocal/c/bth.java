package com.tencent.mm.protocal.c;

import java.util.LinkedList;

public final class bth
  extends com.tencent.mm.bk.a
{
  public String bHt;
  public String fuu;
  public int offset;
  public LinkedList<ps> pKZ = new LinkedList();
  public int scene;
  public String sqA;
  public String sqH;
  public String sqI;
  public String sqJ;
  public String sqK;
  public long sqL;
  public bti sqM;
  public bnq sqN;
  public long sqO;
  public boolean sqP;
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    if (paramInt == 0)
    {
      paramVarArgs = (f.a.a.c.a)paramVarArgs[0];
      if (this.sqH != null) {
        paramVarArgs.g(1, this.sqH);
      }
      if (this.sqI != null) {
        paramVarArgs.g(2, this.sqI);
      }
      if (this.sqJ != null) {
        paramVarArgs.g(3, this.sqJ);
      }
      if (this.sqK != null) {
        paramVarArgs.g(4, this.sqK);
      }
      paramVarArgs.T(5, this.sqL);
      paramVarArgs.fT(6, this.scene);
      if (this.fuu != null) {
        paramVarArgs.g(7, this.fuu);
      }
      if (this.bHt != null) {
        paramVarArgs.g(8, this.bHt);
      }
      if (this.sqM != null)
      {
        paramVarArgs.fV(9, this.sqM.boi());
        this.sqM.a(paramVarArgs);
      }
      if (this.sqN != null)
      {
        paramVarArgs.fV(10, this.sqN.boi());
        this.sqN.a(paramVarArgs);
      }
      paramVarArgs.d(11, 8, this.pKZ);
      paramVarArgs.T(12, this.sqO);
      if (this.sqA != null) {
        paramVarArgs.g(13, this.sqA);
      }
      paramVarArgs.fT(14, this.offset);
      paramVarArgs.av(15, this.sqP);
      return 0;
    }
    if (paramInt == 1) {
      if (this.sqH == null) {
        break label1140;
      }
    }
    label1140:
    for (int i = f.a.a.b.b.a.h(1, this.sqH) + 0;; i = 0)
    {
      paramInt = i;
      if (this.sqI != null) {
        paramInt = i + f.a.a.b.b.a.h(2, this.sqI);
      }
      i = paramInt;
      if (this.sqJ != null) {
        i = paramInt + f.a.a.b.b.a.h(3, this.sqJ);
      }
      paramInt = i;
      if (this.sqK != null) {
        paramInt = i + f.a.a.b.b.a.h(4, this.sqK);
      }
      i = paramInt + f.a.a.a.S(5, this.sqL) + f.a.a.a.fQ(6, this.scene);
      paramInt = i;
      if (this.fuu != null) {
        paramInt = i + f.a.a.b.b.a.h(7, this.fuu);
      }
      i = paramInt;
      if (this.bHt != null) {
        i = paramInt + f.a.a.b.b.a.h(8, this.bHt);
      }
      paramInt = i;
      if (this.sqM != null) {
        paramInt = i + f.a.a.a.fS(9, this.sqM.boi());
      }
      i = paramInt;
      if (this.sqN != null) {
        i = paramInt + f.a.a.a.fS(10, this.sqN.boi());
      }
      i = i + f.a.a.a.c(11, 8, this.pKZ) + f.a.a.a.S(12, this.sqO);
      paramInt = i;
      if (this.sqA != null) {
        paramInt = i + f.a.a.b.b.a.h(13, this.sqA);
      }
      return paramInt + f.a.a.a.fQ(14, this.offset) + (f.a.a.b.b.a.ec(15) + 1);
      if (paramInt == 2)
      {
        paramVarArgs = (byte[])paramVarArgs[0];
        this.pKZ.clear();
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
        Object localObject1 = (f.a.a.a.a)paramVarArgs[0];
        bth localbth = (bth)paramVarArgs[1];
        paramInt = ((Integer)paramVarArgs[2]).intValue();
        Object localObject2;
        boolean bool;
        switch (paramInt)
        {
        default: 
          return -1;
        case 1: 
          localbth.sqH = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        case 2: 
          localbth.sqI = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        case 3: 
          localbth.sqJ = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        case 4: 
          localbth.sqK = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        case 5: 
          localbth.sqL = ((f.a.a.a.a)localObject1).vHC.rZ();
          return 0;
        case 6: 
          localbth.scene = ((f.a.a.a.a)localObject1).vHC.rY();
          return 0;
        case 7: 
          localbth.fuu = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        case 8: 
          localbth.bHt = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        case 9: 
          paramVarArgs = ((f.a.a.a.a)localObject1).IC(paramInt);
          i = paramVarArgs.size();
          paramInt = 0;
          while (paramInt < i)
          {
            localObject2 = (byte[])paramVarArgs.get(paramInt);
            localObject1 = new bti();
            localObject2 = new f.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = ((bti)localObject1).a((f.a.a.a.a)localObject2, (com.tencent.mm.bk.a)localObject1, com.tencent.mm.bk.a.a((f.a.a.a.a)localObject2))) {}
            localbth.sqM = ((bti)localObject1);
            paramInt += 1;
          }
        case 10: 
          paramVarArgs = ((f.a.a.a.a)localObject1).IC(paramInt);
          i = paramVarArgs.size();
          paramInt = 0;
          while (paramInt < i)
          {
            localObject2 = (byte[])paramVarArgs.get(paramInt);
            localObject1 = new bnq();
            localObject2 = new f.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = ((bnq)localObject1).a((f.a.a.a.a)localObject2, (com.tencent.mm.bk.a)localObject1, com.tencent.mm.bk.a.a((f.a.a.a.a)localObject2))) {}
            localbth.sqN = ((bnq)localObject1);
            paramInt += 1;
          }
        case 11: 
          paramVarArgs = ((f.a.a.a.a)localObject1).IC(paramInt);
          i = paramVarArgs.size();
          paramInt = 0;
          while (paramInt < i)
          {
            localObject2 = (byte[])paramVarArgs.get(paramInt);
            localObject1 = new ps();
            localObject2 = new f.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = ((ps)localObject1).a((f.a.a.a.a)localObject2, (com.tencent.mm.bk.a)localObject1, com.tencent.mm.bk.a.a((f.a.a.a.a)localObject2))) {}
            localbth.pKZ.add(localObject1);
            paramInt += 1;
          }
        case 12: 
          localbth.sqO = ((f.a.a.a.a)localObject1).vHC.rZ();
          return 0;
        case 13: 
          localbth.sqA = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        case 14: 
          localbth.offset = ((f.a.a.a.a)localObject1).vHC.rY();
          return 0;
        }
        localbth.sqP = ((f.a.a.a.a)localObject1).cJQ();
        return 0;
      }
      return -1;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/tencent/mm/protocal/c/bth.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */