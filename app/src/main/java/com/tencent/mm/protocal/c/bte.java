package com.tencent.mm.protocal.c;

import java.util.LinkedList;

public final class bte
  extends com.tencent.mm.bk.a
{
  public String bHt;
  public String bJK;
  public String bWr;
  public int bxk;
  public String fuu;
  public String kJG;
  public int offset;
  public int ozm;
  public LinkedList<ps> pKZ = new LinkedList();
  public String pLi;
  public int scene;
  public String sqA;
  public LinkedList<btg> sqB = new LinkedList();
  public int sqC;
  public String sqD;
  public String url;
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    if (paramInt == 0)
    {
      paramVarArgs = (f.a.a.c.a)paramVarArgs[0];
      if (this.fuu != null) {
        paramVarArgs.g(1, this.fuu);
      }
      if (this.bJK != null) {
        paramVarArgs.g(2, this.bJK);
      }
      if (this.bWr != null) {
        paramVarArgs.g(3, this.bWr);
      }
      paramVarArgs.fT(4, this.offset);
      if (this.bHt != null) {
        paramVarArgs.g(5, this.bHt);
      }
      paramVarArgs.fT(6, this.scene);
      if (this.url != null) {
        paramVarArgs.g(7, this.url);
      }
      if (this.kJG != null) {
        paramVarArgs.g(8, this.kJG);
      }
      paramVarArgs.d(9, 8, this.pKZ);
      if (this.sqA != null) {
        paramVarArgs.g(10, this.sqA);
      }
      paramVarArgs.d(11, 8, this.sqB);
      paramVarArgs.fT(12, this.ozm);
      paramVarArgs.fT(13, this.bxk);
      if (this.pLi != null) {
        paramVarArgs.g(14, this.pLi);
      }
      paramVarArgs.fT(15, this.sqC);
      if (this.sqD != null) {
        paramVarArgs.g(16, this.sqD);
      }
      return 0;
    }
    if (paramInt == 1) {
      if (this.fuu == null) {
        break label1100;
      }
    }
    label1100:
    for (int i = f.a.a.b.b.a.h(1, this.fuu) + 0;; i = 0)
    {
      paramInt = i;
      if (this.bJK != null) {
        paramInt = i + f.a.a.b.b.a.h(2, this.bJK);
      }
      i = paramInt;
      if (this.bWr != null) {
        i = paramInt + f.a.a.b.b.a.h(3, this.bWr);
      }
      i += f.a.a.a.fQ(4, this.offset);
      paramInt = i;
      if (this.bHt != null) {
        paramInt = i + f.a.a.b.b.a.h(5, this.bHt);
      }
      i = paramInt + f.a.a.a.fQ(6, this.scene);
      paramInt = i;
      if (this.url != null) {
        paramInt = i + f.a.a.b.b.a.h(7, this.url);
      }
      i = paramInt;
      if (this.kJG != null) {
        i = paramInt + f.a.a.b.b.a.h(8, this.kJG);
      }
      i += f.a.a.a.c(9, 8, this.pKZ);
      paramInt = i;
      if (this.sqA != null) {
        paramInt = i + f.a.a.b.b.a.h(10, this.sqA);
      }
      i = paramInt + f.a.a.a.c(11, 8, this.sqB) + f.a.a.a.fQ(12, this.ozm) + f.a.a.a.fQ(13, this.bxk);
      paramInt = i;
      if (this.pLi != null) {
        paramInt = i + f.a.a.b.b.a.h(14, this.pLi);
      }
      i = paramInt + f.a.a.a.fQ(15, this.sqC);
      paramInt = i;
      if (this.sqD != null) {
        paramInt = i + f.a.a.b.b.a.h(16, this.sqD);
      }
      return paramInt;
      if (paramInt == 2)
      {
        paramVarArgs = (byte[])paramVarArgs[0];
        this.pKZ.clear();
        this.sqB.clear();
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
        bte localbte = (bte)paramVarArgs[1];
        paramInt = ((Integer)paramVarArgs[2]).intValue();
        Object localObject2;
        boolean bool;
        switch (paramInt)
        {
        default: 
          return -1;
        case 1: 
          localbte.fuu = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        case 2: 
          localbte.bJK = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        case 3: 
          localbte.bWr = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        case 4: 
          localbte.offset = ((f.a.a.a.a)localObject1).vHC.rY();
          return 0;
        case 5: 
          localbte.bHt = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        case 6: 
          localbte.scene = ((f.a.a.a.a)localObject1).vHC.rY();
          return 0;
        case 7: 
          localbte.url = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        case 8: 
          localbte.kJG = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        case 9: 
          paramVarArgs = ((f.a.a.a.a)localObject1).IC(paramInt);
          i = paramVarArgs.size();
          paramInt = 0;
          while (paramInt < i)
          {
            localObject2 = (byte[])paramVarArgs.get(paramInt);
            localObject1 = new ps();
            localObject2 = new f.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = ((ps)localObject1).a((f.a.a.a.a)localObject2, (com.tencent.mm.bk.a)localObject1, com.tencent.mm.bk.a.a((f.a.a.a.a)localObject2))) {}
            localbte.pKZ.add(localObject1);
            paramInt += 1;
          }
        case 10: 
          localbte.sqA = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        case 11: 
          paramVarArgs = ((f.a.a.a.a)localObject1).IC(paramInt);
          i = paramVarArgs.size();
          paramInt = 0;
          while (paramInt < i)
          {
            localObject2 = (byte[])paramVarArgs.get(paramInt);
            localObject1 = new btg();
            localObject2 = new f.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = ((btg)localObject1).a((f.a.a.a.a)localObject2, (com.tencent.mm.bk.a)localObject1, com.tencent.mm.bk.a.a((f.a.a.a.a)localObject2))) {}
            localbte.sqB.add(localObject1);
            paramInt += 1;
          }
        case 12: 
          localbte.ozm = ((f.a.a.a.a)localObject1).vHC.rY();
          return 0;
        case 13: 
          localbte.bxk = ((f.a.a.a.a)localObject1).vHC.rY();
          return 0;
        case 14: 
          localbte.pLi = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        case 15: 
          localbte.sqC = ((f.a.a.a.a)localObject1).vHC.rY();
          return 0;
        }
        localbte.sqD = ((f.a.a.a.a)localObject1).vHC.readString();
        return 0;
      }
      return -1;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/protocal/c/bte.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */