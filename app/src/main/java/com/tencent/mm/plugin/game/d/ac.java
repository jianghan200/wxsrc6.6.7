package com.tencent.mm.plugin.game.d;

import java.util.LinkedList;

public final class ac
  extends com.tencent.mm.bk.a
{
  public String jOU;
  public String jPA;
  public int jPC;
  public int jPF;
  public cw jQA;
  public n jQB;
  public n jQC;
  public String jQb;
  public bz jQr;
  public dk jQs;
  public ci jQt;
  public cj jQu;
  public av jQv;
  public cr jQw;
  public ar jQx;
  public o jQy;
  public cm jQz;
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    if (paramInt == 0)
    {
      paramVarArgs = (f.a.a.c.a)paramVarArgs[0];
      paramVarArgs.fT(1, this.jPF);
      paramVarArgs.fT(2, this.jPC);
      if (this.jPA != null) {
        paramVarArgs.g(3, this.jPA);
      }
      if (this.jQb != null) {
        paramVarArgs.g(4, this.jQb);
      }
      if (this.jOU != null) {
        paramVarArgs.g(17, this.jOU);
      }
      if (this.jQr != null)
      {
        paramVarArgs.fV(5, this.jQr.boi());
        this.jQr.a(paramVarArgs);
      }
      if (this.jQs != null)
      {
        paramVarArgs.fV(6, this.jQs.boi());
        this.jQs.a(paramVarArgs);
      }
      if (this.jQt != null)
      {
        paramVarArgs.fV(7, this.jQt.boi());
        this.jQt.a(paramVarArgs);
      }
      if (this.jQu != null)
      {
        paramVarArgs.fV(8, this.jQu.boi());
        this.jQu.a(paramVarArgs);
      }
      if (this.jQv != null)
      {
        paramVarArgs.fV(9, this.jQv.boi());
        this.jQv.a(paramVarArgs);
      }
      if (this.jQw != null)
      {
        paramVarArgs.fV(10, this.jQw.boi());
        this.jQw.a(paramVarArgs);
      }
      if (this.jQx != null)
      {
        paramVarArgs.fV(11, this.jQx.boi());
        this.jQx.a(paramVarArgs);
      }
      if (this.jQy != null)
      {
        paramVarArgs.fV(12, this.jQy.boi());
        this.jQy.a(paramVarArgs);
      }
      if (this.jQz != null)
      {
        paramVarArgs.fV(13, this.jQz.boi());
        this.jQz.a(paramVarArgs);
      }
      if (this.jQA != null)
      {
        paramVarArgs.fV(14, this.jQA.boi());
        this.jQA.a(paramVarArgs);
      }
      if (this.jQB != null)
      {
        paramVarArgs.fV(15, this.jQB.boi());
        this.jQB.a(paramVarArgs);
      }
      if (this.jQC != null)
      {
        paramVarArgs.fV(16, this.jQC.boi());
        this.jQC.a(paramVarArgs);
      }
      paramInt = 0;
    }
    int i;
    do
    {
      return paramInt;
      if (paramInt != 1) {
        break;
      }
      i = f.a.a.a.fQ(1, this.jPF) + 0 + f.a.a.a.fQ(2, this.jPC);
      paramInt = i;
      if (this.jPA != null) {
        paramInt = i + f.a.a.b.b.a.h(3, this.jPA);
      }
      i = paramInt;
      if (this.jQb != null) {
        i = paramInt + f.a.a.b.b.a.h(4, this.jQb);
      }
      paramInt = i;
      if (this.jOU != null) {
        paramInt = i + f.a.a.b.b.a.h(17, this.jOU);
      }
      i = paramInt;
      if (this.jQr != null) {
        i = paramInt + f.a.a.a.fS(5, this.jQr.boi());
      }
      paramInt = i;
      if (this.jQs != null) {
        paramInt = i + f.a.a.a.fS(6, this.jQs.boi());
      }
      i = paramInt;
      if (this.jQt != null) {
        i = paramInt + f.a.a.a.fS(7, this.jQt.boi());
      }
      paramInt = i;
      if (this.jQu != null) {
        paramInt = i + f.a.a.a.fS(8, this.jQu.boi());
      }
      i = paramInt;
      if (this.jQv != null) {
        i = paramInt + f.a.a.a.fS(9, this.jQv.boi());
      }
      paramInt = i;
      if (this.jQw != null) {
        paramInt = i + f.a.a.a.fS(10, this.jQw.boi());
      }
      i = paramInt;
      if (this.jQx != null) {
        i = paramInt + f.a.a.a.fS(11, this.jQx.boi());
      }
      paramInt = i;
      if (this.jQy != null) {
        paramInt = i + f.a.a.a.fS(12, this.jQy.boi());
      }
      i = paramInt;
      if (this.jQz != null) {
        i = paramInt + f.a.a.a.fS(13, this.jQz.boi());
      }
      paramInt = i;
      if (this.jQA != null) {
        paramInt = i + f.a.a.a.fS(14, this.jQA.boi());
      }
      i = paramInt;
      if (this.jQB != null) {
        i = paramInt + f.a.a.a.fS(15, this.jQB.boi());
      }
      paramInt = i;
    } while (this.jQC == null);
    return i + f.a.a.a.fS(16, this.jQC.boi());
    if (paramInt == 2)
    {
      paramVarArgs = new f.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
      for (paramInt = com.tencent.mm.bk.a.a(paramVarArgs); paramInt > 0; paramInt = com.tencent.mm.bk.a.a(paramVarArgs)) {
        if (!super.a(paramVarArgs, this, paramInt)) {
          paramVarArgs.cJS();
        }
      }
      return 0;
    }
    if (paramInt == 3)
    {
      Object localObject1 = (f.a.a.a.a)paramVarArgs[0];
      ac localac = (ac)paramVarArgs[1];
      paramInt = ((Integer)paramVarArgs[2]).intValue();
      Object localObject2;
      boolean bool;
      switch (paramInt)
      {
      default: 
        return -1;
      case 1: 
        localac.jPF = ((f.a.a.a.a)localObject1).vHC.rY();
        return 0;
      case 2: 
        localac.jPC = ((f.a.a.a.a)localObject1).vHC.rY();
        return 0;
      case 3: 
        localac.jPA = ((f.a.a.a.a)localObject1).vHC.readString();
        return 0;
      case 4: 
        localac.jQb = ((f.a.a.a.a)localObject1).vHC.readString();
        return 0;
      case 17: 
        localac.jOU = ((f.a.a.a.a)localObject1).vHC.readString();
        return 0;
      case 5: 
        paramVarArgs = ((f.a.a.a.a)localObject1).IC(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new bz();
          localObject2 = new f.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((bz)localObject1).a((f.a.a.a.a)localObject2, (com.tencent.mm.bk.a)localObject1, com.tencent.mm.bk.a.a((f.a.a.a.a)localObject2))) {}
          localac.jQr = ((bz)localObject1);
          paramInt += 1;
        }
        return 0;
      case 6: 
        paramVarArgs = ((f.a.a.a.a)localObject1).IC(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new dk();
          localObject2 = new f.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((dk)localObject1).a((f.a.a.a.a)localObject2, (com.tencent.mm.bk.a)localObject1, com.tencent.mm.bk.a.a((f.a.a.a.a)localObject2))) {}
          localac.jQs = ((dk)localObject1);
          paramInt += 1;
        }
        return 0;
      case 7: 
        paramVarArgs = ((f.a.a.a.a)localObject1).IC(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new ci();
          localObject2 = new f.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((ci)localObject1).a((f.a.a.a.a)localObject2, (com.tencent.mm.bk.a)localObject1, com.tencent.mm.bk.a.a((f.a.a.a.a)localObject2))) {}
          localac.jQt = ((ci)localObject1);
          paramInt += 1;
        }
        return 0;
      case 8: 
        paramVarArgs = ((f.a.a.a.a)localObject1).IC(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new cj();
          localObject2 = new f.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((cj)localObject1).a((f.a.a.a.a)localObject2, (com.tencent.mm.bk.a)localObject1, com.tencent.mm.bk.a.a((f.a.a.a.a)localObject2))) {}
          localac.jQu = ((cj)localObject1);
          paramInt += 1;
        }
        return 0;
      case 9: 
        paramVarArgs = ((f.a.a.a.a)localObject1).IC(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new av();
          localObject2 = new f.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((av)localObject1).a((f.a.a.a.a)localObject2, (com.tencent.mm.bk.a)localObject1, com.tencent.mm.bk.a.a((f.a.a.a.a)localObject2))) {}
          localac.jQv = ((av)localObject1);
          paramInt += 1;
        }
        return 0;
      case 10: 
        paramVarArgs = ((f.a.a.a.a)localObject1).IC(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new cr();
          localObject2 = new f.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((cr)localObject1).a((f.a.a.a.a)localObject2, (com.tencent.mm.bk.a)localObject1, com.tencent.mm.bk.a.a((f.a.a.a.a)localObject2))) {}
          localac.jQw = ((cr)localObject1);
          paramInt += 1;
        }
        return 0;
      case 11: 
        paramVarArgs = ((f.a.a.a.a)localObject1).IC(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new ar();
          localObject2 = new f.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((ar)localObject1).a((f.a.a.a.a)localObject2, (com.tencent.mm.bk.a)localObject1, com.tencent.mm.bk.a.a((f.a.a.a.a)localObject2))) {}
          localac.jQx = ((ar)localObject1);
          paramInt += 1;
        }
        return 0;
      case 12: 
        paramVarArgs = ((f.a.a.a.a)localObject1).IC(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new o();
          localObject2 = new f.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((o)localObject1).a((f.a.a.a.a)localObject2, (com.tencent.mm.bk.a)localObject1, com.tencent.mm.bk.a.a((f.a.a.a.a)localObject2))) {}
          localac.jQy = ((o)localObject1);
          paramInt += 1;
        }
        return 0;
      case 13: 
        paramVarArgs = ((f.a.a.a.a)localObject1).IC(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new cm();
          localObject2 = new f.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((cm)localObject1).a((f.a.a.a.a)localObject2, (com.tencent.mm.bk.a)localObject1, com.tencent.mm.bk.a.a((f.a.a.a.a)localObject2))) {}
          localac.jQz = ((cm)localObject1);
          paramInt += 1;
        }
        return 0;
      case 14: 
        paramVarArgs = ((f.a.a.a.a)localObject1).IC(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new cw();
          localObject2 = new f.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((cw)localObject1).a((f.a.a.a.a)localObject2, (com.tencent.mm.bk.a)localObject1, com.tencent.mm.bk.a.a((f.a.a.a.a)localObject2))) {}
          localac.jQA = ((cw)localObject1);
          paramInt += 1;
        }
        return 0;
      case 15: 
        paramVarArgs = ((f.a.a.a.a)localObject1).IC(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new n();
          localObject2 = new f.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((n)localObject1).a((f.a.a.a.a)localObject2, (com.tencent.mm.bk.a)localObject1, com.tencent.mm.bk.a.a((f.a.a.a.a)localObject2))) {}
          localac.jQB = ((n)localObject1);
          paramInt += 1;
        }
        return 0;
      }
      paramVarArgs = ((f.a.a.a.a)localObject1).IC(paramInt);
      i = paramVarArgs.size();
      paramInt = 0;
      while (paramInt < i)
      {
        localObject2 = (byte[])paramVarArgs.get(paramInt);
        localObject1 = new n();
        localObject2 = new f.a.a.a.a((byte[])localObject2, unknownTagHandler);
        for (bool = true; bool; bool = ((n)localObject1).a((f.a.a.a.a)localObject2, (com.tencent.mm.bk.a)localObject1, com.tencent.mm.bk.a.a((f.a.a.a.a)localObject2))) {}
        localac.jQC = ((n)localObject1);
        paramInt += 1;
      }
      return 0;
    }
    return -1;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/tencent/mm/plugin/game/d/ac.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */