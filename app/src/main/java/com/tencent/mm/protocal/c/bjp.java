package com.tencent.mm.protocal.c;

import java.util.LinkedList;

public final class bjp
  extends com.tencent.mm.bk.a
{
  public int eJH;
  public String hbL;
  public String hcS;
  public String jQb;
  public String rEJ;
  public String rqZ;
  public String rra;
  public String ruh;
  public String rui;
  public axr sjA;
  public String sjB;
  public String sjC;
  public int sjj;
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    if (paramInt == 0)
    {
      paramVarArgs = (f.a.a.c.a)paramVarArgs[0];
      if (this.hbL != null) {
        paramVarArgs.g(1, this.hbL);
      }
      if (this.hcS != null) {
        paramVarArgs.g(2, this.hcS);
      }
      if (this.ruh != null) {
        paramVarArgs.g(3, this.ruh);
      }
      if (this.rui != null) {
        paramVarArgs.g(4, this.rui);
      }
      paramVarArgs.fT(5, this.eJH);
      if (this.rqZ != null) {
        paramVarArgs.g(6, this.rqZ);
      }
      if (this.rra != null) {
        paramVarArgs.g(7, this.rra);
      }
      if (this.jQb != null) {
        paramVarArgs.g(8, this.jQb);
      }
      paramVarArgs.fT(9, this.sjj);
      if (this.sjA != null)
      {
        paramVarArgs.fV(10, this.sjA.boi());
        this.sjA.a(paramVarArgs);
      }
      if (this.rEJ != null) {
        paramVarArgs.g(11, this.rEJ);
      }
      if (this.sjB != null) {
        paramVarArgs.g(12, this.sjB);
      }
      if (this.sjC != null) {
        paramVarArgs.g(13, this.sjC);
      }
      return 0;
    }
    if (paramInt == 1) {
      if (this.hbL == null) {
        break label917;
      }
    }
    label917:
    for (int i = f.a.a.b.b.a.h(1, this.hbL) + 0;; i = 0)
    {
      paramInt = i;
      if (this.hcS != null) {
        paramInt = i + f.a.a.b.b.a.h(2, this.hcS);
      }
      i = paramInt;
      if (this.ruh != null) {
        i = paramInt + f.a.a.b.b.a.h(3, this.ruh);
      }
      paramInt = i;
      if (this.rui != null) {
        paramInt = i + f.a.a.b.b.a.h(4, this.rui);
      }
      i = paramInt + f.a.a.a.fQ(5, this.eJH);
      paramInt = i;
      if (this.rqZ != null) {
        paramInt = i + f.a.a.b.b.a.h(6, this.rqZ);
      }
      i = paramInt;
      if (this.rra != null) {
        i = paramInt + f.a.a.b.b.a.h(7, this.rra);
      }
      paramInt = i;
      if (this.jQb != null) {
        paramInt = i + f.a.a.b.b.a.h(8, this.jQb);
      }
      i = paramInt + f.a.a.a.fQ(9, this.sjj);
      paramInt = i;
      if (this.sjA != null) {
        paramInt = i + f.a.a.a.fS(10, this.sjA.boi());
      }
      i = paramInt;
      if (this.rEJ != null) {
        i = paramInt + f.a.a.b.b.a.h(11, this.rEJ);
      }
      paramInt = i;
      if (this.sjB != null) {
        paramInt = i + f.a.a.b.b.a.h(12, this.sjB);
      }
      i = paramInt;
      if (this.sjC != null) {
        i = paramInt + f.a.a.b.b.a.h(13, this.sjC);
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
        Object localObject1 = (f.a.a.a.a)paramVarArgs[0];
        bjp localbjp = (bjp)paramVarArgs[1];
        paramInt = ((Integer)paramVarArgs[2]).intValue();
        switch (paramInt)
        {
        default: 
          return -1;
        case 1: 
          localbjp.hbL = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        case 2: 
          localbjp.hcS = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        case 3: 
          localbjp.ruh = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        case 4: 
          localbjp.rui = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        case 5: 
          localbjp.eJH = ((f.a.a.a.a)localObject1).vHC.rY();
          return 0;
        case 6: 
          localbjp.rqZ = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        case 7: 
          localbjp.rra = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        case 8: 
          localbjp.jQb = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        case 9: 
          localbjp.sjj = ((f.a.a.a.a)localObject1).vHC.rY();
          return 0;
        case 10: 
          paramVarArgs = ((f.a.a.a.a)localObject1).IC(paramInt);
          i = paramVarArgs.size();
          paramInt = 0;
          while (paramInt < i)
          {
            Object localObject2 = (byte[])paramVarArgs.get(paramInt);
            localObject1 = new axr();
            localObject2 = new f.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (boolean bool = true; bool; bool = ((axr)localObject1).a((f.a.a.a.a)localObject2, (com.tencent.mm.bk.a)localObject1, com.tencent.mm.bk.a.a((f.a.a.a.a)localObject2))) {}
            localbjp.sjA = ((axr)localObject1);
            paramInt += 1;
          }
        case 11: 
          localbjp.rEJ = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        case 12: 
          localbjp.sjB = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        }
        localbjp.sjC = ((f.a.a.a.a)localObject1).vHC.readString();
        return 0;
      }
      return -1;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/tencent/mm/protocal/c/bjp.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */