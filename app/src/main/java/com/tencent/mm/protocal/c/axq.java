package com.tencent.mm.protocal.c;

import java.util.LinkedList;

public final class axq
  extends com.tencent.mm.bk.a
{
  public String eup;
  public String fky;
  public String hva;
  public String nickname;
  public String rcw;
  public String saL;
  public String saM;
  public String saN;
  public String saO;
  public String saP;
  public String saQ;
  public axr saR;
  public String saS;
  public int sex;
  public int source;
  public int type;
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    if (paramInt == 0)
    {
      paramVarArgs = (f.a.a.c.a)paramVarArgs[0];
      if (this.eup != null) {
        paramVarArgs.g(1, this.eup);
      }
      if (this.nickname != null) {
        paramVarArgs.g(2, this.nickname);
      }
      paramVarArgs.fT(3, this.type);
      if (this.fky != null) {
        paramVarArgs.g(4, this.fky);
      }
      if (this.saL != null) {
        paramVarArgs.g(5, this.saL);
      }
      if (this.saM != null) {
        paramVarArgs.g(6, this.saM);
      }
      paramVarArgs.fT(7, this.source);
      if (this.saN != null) {
        paramVarArgs.g(8, this.saN);
      }
      if (this.saO != null) {
        paramVarArgs.g(9, this.saO);
      }
      if (this.saP != null) {
        paramVarArgs.g(10, this.saP);
      }
      if (this.saQ != null) {
        paramVarArgs.g(11, this.saQ);
      }
      if (this.saR != null)
      {
        paramVarArgs.fV(12, this.saR.boi());
        this.saR.a(paramVarArgs);
      }
      if (this.rcw != null) {
        paramVarArgs.g(13, this.rcw);
      }
      if (this.hva != null) {
        paramVarArgs.g(14, this.hva);
      }
      paramVarArgs.fT(15, this.sex);
      if (this.saS != null) {
        paramVarArgs.g(16, this.saS);
      }
      return 0;
    }
    if (paramInt == 1) {
      if (this.eup == null) {
        break label1070;
      }
    }
    label1070:
    for (paramInt = f.a.a.b.b.a.h(1, this.eup) + 0;; paramInt = 0)
    {
      int i = paramInt;
      if (this.nickname != null) {
        i = paramInt + f.a.a.b.b.a.h(2, this.nickname);
      }
      i += f.a.a.a.fQ(3, this.type);
      paramInt = i;
      if (this.fky != null) {
        paramInt = i + f.a.a.b.b.a.h(4, this.fky);
      }
      i = paramInt;
      if (this.saL != null) {
        i = paramInt + f.a.a.b.b.a.h(5, this.saL);
      }
      paramInt = i;
      if (this.saM != null) {
        paramInt = i + f.a.a.b.b.a.h(6, this.saM);
      }
      i = paramInt + f.a.a.a.fQ(7, this.source);
      paramInt = i;
      if (this.saN != null) {
        paramInt = i + f.a.a.b.b.a.h(8, this.saN);
      }
      i = paramInt;
      if (this.saO != null) {
        i = paramInt + f.a.a.b.b.a.h(9, this.saO);
      }
      paramInt = i;
      if (this.saP != null) {
        paramInt = i + f.a.a.b.b.a.h(10, this.saP);
      }
      i = paramInt;
      if (this.saQ != null) {
        i = paramInt + f.a.a.b.b.a.h(11, this.saQ);
      }
      paramInt = i;
      if (this.saR != null) {
        paramInt = i + f.a.a.a.fS(12, this.saR.boi());
      }
      i = paramInt;
      if (this.rcw != null) {
        i = paramInt + f.a.a.b.b.a.h(13, this.rcw);
      }
      paramInt = i;
      if (this.hva != null) {
        paramInt = i + f.a.a.b.b.a.h(14, this.hva);
      }
      i = paramInt + f.a.a.a.fQ(15, this.sex);
      paramInt = i;
      if (this.saS != null) {
        paramInt = i + f.a.a.b.b.a.h(16, this.saS);
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
        Object localObject1 = (f.a.a.a.a)paramVarArgs[0];
        axq localaxq = (axq)paramVarArgs[1];
        paramInt = ((Integer)paramVarArgs[2]).intValue();
        switch (paramInt)
        {
        default: 
          return -1;
        case 1: 
          localaxq.eup = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        case 2: 
          localaxq.nickname = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        case 3: 
          localaxq.type = ((f.a.a.a.a)localObject1).vHC.rY();
          return 0;
        case 4: 
          localaxq.fky = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        case 5: 
          localaxq.saL = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        case 6: 
          localaxq.saM = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        case 7: 
          localaxq.source = ((f.a.a.a.a)localObject1).vHC.rY();
          return 0;
        case 8: 
          localaxq.saN = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        case 9: 
          localaxq.saO = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        case 10: 
          localaxq.saP = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        case 11: 
          localaxq.saQ = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        case 12: 
          paramVarArgs = ((f.a.a.a.a)localObject1).IC(paramInt);
          i = paramVarArgs.size();
          paramInt = 0;
          while (paramInt < i)
          {
            Object localObject2 = (byte[])paramVarArgs.get(paramInt);
            localObject1 = new axr();
            localObject2 = new f.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (boolean bool = true; bool; bool = ((axr)localObject1).a((f.a.a.a.a)localObject2, (com.tencent.mm.bk.a)localObject1, com.tencent.mm.bk.a.a((f.a.a.a.a)localObject2))) {}
            localaxq.saR = ((axr)localObject1);
            paramInt += 1;
          }
        case 13: 
          localaxq.rcw = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        case 14: 
          localaxq.hva = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        case 15: 
          localaxq.sex = ((f.a.a.a.a)localObject1).vHC.rY();
          return 0;
        }
        localaxq.saS = ((f.a.a.a.a)localObject1).vHC.readString();
        return 0;
      }
      return -1;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/mm/protocal/c/axq.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */