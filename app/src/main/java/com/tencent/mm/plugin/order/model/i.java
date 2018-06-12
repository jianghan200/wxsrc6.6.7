package com.tencent.mm.plugin.order.model;

import java.util.LinkedList;

public final class i
  extends com.tencent.mm.bk.a
{
  public String jSv;
  public String lOE;
  public double lOF;
  public String lOG;
  public int lOH;
  public String lOI;
  public int lOJ;
  public String lOK;
  public int lOL;
  public int lOM;
  public String lON;
  public String lOO;
  public String lOP;
  public String lOQ;
  public String lOR;
  public int lOS;
  public LinkedList<k> lOT = new LinkedList();
  public String lOU;
  public String lOV;
  public double lOW;
  public String lOX;
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    if (paramInt == 0)
    {
      paramVarArgs = (f.a.a.c.a)paramVarArgs[0];
      if (this.lOE != null) {
        paramVarArgs.g(1, this.lOE);
      }
      paramVarArgs.c(2, this.lOF);
      if (this.lOG != null) {
        paramVarArgs.g(3, this.lOG);
      }
      paramVarArgs.fT(4, this.lOH);
      if (this.lOI != null) {
        paramVarArgs.g(5, this.lOI);
      }
      paramVarArgs.fT(6, this.lOJ);
      if (this.lOK != null) {
        paramVarArgs.g(7, this.lOK);
      }
      paramVarArgs.fT(8, this.lOL);
      paramVarArgs.fT(9, this.lOM);
      if (this.lON != null) {
        paramVarArgs.g(10, this.lON);
      }
      if (this.jSv != null) {
        paramVarArgs.g(11, this.jSv);
      }
      if (this.lOO != null) {
        paramVarArgs.g(12, this.lOO);
      }
      if (this.lOP != null) {
        paramVarArgs.g(13, this.lOP);
      }
      if (this.lOQ != null) {
        paramVarArgs.g(14, this.lOQ);
      }
      if (this.lOR != null) {
        paramVarArgs.g(15, this.lOR);
      }
      paramVarArgs.fT(16, this.lOS);
      paramVarArgs.d(17, 8, this.lOT);
      if (this.lOU != null) {
        paramVarArgs.g(18, this.lOU);
      }
      if (this.lOV != null) {
        paramVarArgs.g(19, this.lOV);
      }
      paramVarArgs.c(20, this.lOW);
      if (this.lOX != null) {
        paramVarArgs.g(21, this.lOX);
      }
      return 0;
    }
    if (paramInt == 1) {
      if (this.lOE == null) {
        break label1273;
      }
    }
    label1273:
    for (paramInt = f.a.a.b.b.a.h(1, this.lOE) + 0;; paramInt = 0)
    {
      int i = paramInt + (f.a.a.b.b.a.ec(2) + 8);
      paramInt = i;
      if (this.lOG != null) {
        paramInt = i + f.a.a.b.b.a.h(3, this.lOG);
      }
      i = paramInt + f.a.a.a.fQ(4, this.lOH);
      paramInt = i;
      if (this.lOI != null) {
        paramInt = i + f.a.a.b.b.a.h(5, this.lOI);
      }
      i = paramInt + f.a.a.a.fQ(6, this.lOJ);
      paramInt = i;
      if (this.lOK != null) {
        paramInt = i + f.a.a.b.b.a.h(7, this.lOK);
      }
      i = paramInt + f.a.a.a.fQ(8, this.lOL) + f.a.a.a.fQ(9, this.lOM);
      paramInt = i;
      if (this.lON != null) {
        paramInt = i + f.a.a.b.b.a.h(10, this.lON);
      }
      i = paramInt;
      if (this.jSv != null) {
        i = paramInt + f.a.a.b.b.a.h(11, this.jSv);
      }
      paramInt = i;
      if (this.lOO != null) {
        paramInt = i + f.a.a.b.b.a.h(12, this.lOO);
      }
      i = paramInt;
      if (this.lOP != null) {
        i = paramInt + f.a.a.b.b.a.h(13, this.lOP);
      }
      paramInt = i;
      if (this.lOQ != null) {
        paramInt = i + f.a.a.b.b.a.h(14, this.lOQ);
      }
      i = paramInt;
      if (this.lOR != null) {
        i = paramInt + f.a.a.b.b.a.h(15, this.lOR);
      }
      i = i + f.a.a.a.fQ(16, this.lOS) + f.a.a.a.c(17, 8, this.lOT);
      paramInt = i;
      if (this.lOU != null) {
        paramInt = i + f.a.a.b.b.a.h(18, this.lOU);
      }
      i = paramInt;
      if (this.lOV != null) {
        i = paramInt + f.a.a.b.b.a.h(19, this.lOV);
      }
      i += f.a.a.b.b.a.ec(20) + 8;
      paramInt = i;
      if (this.lOX != null) {
        paramInt = i + f.a.a.b.b.a.h(21, this.lOX);
      }
      return paramInt;
      if (paramInt == 2)
      {
        paramVarArgs = (byte[])paramVarArgs[0];
        this.lOT.clear();
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
        i locali = (i)paramVarArgs[1];
        paramInt = ((Integer)paramVarArgs[2]).intValue();
        switch (paramInt)
        {
        default: 
          return -1;
        case 1: 
          locali.lOE = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        case 2: 
          locali.lOF = ((f.a.a.a.a)localObject1).vHC.readDouble();
          return 0;
        case 3: 
          locali.lOG = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        case 4: 
          locali.lOH = ((f.a.a.a.a)localObject1).vHC.rY();
          return 0;
        case 5: 
          locali.lOI = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        case 6: 
          locali.lOJ = ((f.a.a.a.a)localObject1).vHC.rY();
          return 0;
        case 7: 
          locali.lOK = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        case 8: 
          locali.lOL = ((f.a.a.a.a)localObject1).vHC.rY();
          return 0;
        case 9: 
          locali.lOM = ((f.a.a.a.a)localObject1).vHC.rY();
          return 0;
        case 10: 
          locali.lON = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        case 11: 
          locali.jSv = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        case 12: 
          locali.lOO = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        case 13: 
          locali.lOP = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        case 14: 
          locali.lOQ = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        case 15: 
          locali.lOR = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        case 16: 
          locali.lOS = ((f.a.a.a.a)localObject1).vHC.rY();
          return 0;
        case 17: 
          paramVarArgs = ((f.a.a.a.a)localObject1).IC(paramInt);
          i = paramVarArgs.size();
          paramInt = 0;
          while (paramInt < i)
          {
            Object localObject2 = (byte[])paramVarArgs.get(paramInt);
            localObject1 = new k();
            localObject2 = new f.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (boolean bool = true; bool; bool = ((k)localObject1).a((f.a.a.a.a)localObject2, (com.tencent.mm.bk.a)localObject1, com.tencent.mm.bk.a.a((f.a.a.a.a)localObject2))) {}
            locali.lOT.add(localObject1);
            paramInt += 1;
          }
        case 18: 
          locali.lOU = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        case 19: 
          locali.lOV = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        case 20: 
          locali.lOW = ((f.a.a.a.a)localObject1).vHC.readDouble();
          return 0;
        }
        locali.lOX = ((f.a.a.a.a)localObject1).vHC.readString();
        return 0;
      }
      return -1;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/plugin/order/model/i.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */