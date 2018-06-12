package com.tencent.mm.protocal.c;

import f.a.a.b;
import java.util.LinkedList;

public final class ec
  extends com.tencent.mm.bk.a
{
  public int iwE;
  public String raI;
  public String reA;
  public bhy reB;
  public String reC;
  public bnp reD;
  public String reE;
  public int reF;
  public int reG;
  public int reH;
  public int reI;
  public sx req;
  public bhy rer;
  public bhy res;
  public int reu;
  public bhy rev;
  public cco rew;
  public cgf rex;
  public bhy rey;
  public bhy rez;
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    if (paramInt == 0)
    {
      paramVarArgs = (f.a.a.c.a)paramVarArgs[0];
      if (this.req == null) {
        throw new b("Not all required fields were included: SvrPubECDHKey");
      }
      if (this.rer == null) {
        throw new b("Not all required fields were included: SessionKey");
      }
      if (this.res == null) {
        throw new b("Not all required fields were included: AutoAuthKey");
      }
      paramVarArgs.fT(1, this.iwE);
      if (this.req != null)
      {
        paramVarArgs.fV(2, this.req.boi());
        this.req.a(paramVarArgs);
      }
      if (this.rer != null)
      {
        paramVarArgs.fV(3, this.rer.boi());
        this.rer.a(paramVarArgs);
      }
      if (this.res != null)
      {
        paramVarArgs.fV(4, this.res.boi());
        this.res.a(paramVarArgs);
      }
      paramVarArgs.fT(5, this.reu);
      if (this.rev != null)
      {
        paramVarArgs.fV(6, this.rev.boi());
        this.rev.a(paramVarArgs);
      }
      if (this.rew != null)
      {
        paramVarArgs.fV(7, this.rew.boi());
        this.rew.a(paramVarArgs);
      }
      if (this.rex != null)
      {
        paramVarArgs.fV(8, this.rex.boi());
        this.rex.a(paramVarArgs);
      }
      if (this.rey != null)
      {
        paramVarArgs.fV(9, this.rey.boi());
        this.rey.a(paramVarArgs);
      }
      if (this.rez != null)
      {
        paramVarArgs.fV(10, this.rez.boi());
        this.rez.a(paramVarArgs);
      }
      if (this.reA != null) {
        paramVarArgs.g(11, this.reA);
      }
      if (this.reB != null)
      {
        paramVarArgs.fV(12, this.reB.boi());
        this.reB.a(paramVarArgs);
      }
      if (this.reC != null) {
        paramVarArgs.g(14, this.reC);
      }
      if (this.reD != null)
      {
        paramVarArgs.fV(15, this.reD.boi());
        this.reD.a(paramVarArgs);
      }
      if (this.reE != null) {
        paramVarArgs.g(16, this.reE);
      }
      paramVarArgs.fT(17, this.reF);
      paramVarArgs.fT(18, this.reG);
      paramVarArgs.fT(19, this.reH);
      if (this.raI != null) {
        paramVarArgs.g(20, this.raI);
      }
      paramVarArgs.fT(21, this.reI);
      return 0;
    }
    int i;
    if (paramInt == 1)
    {
      i = f.a.a.a.fQ(1, this.iwE) + 0;
      paramInt = i;
      if (this.req != null) {
        paramInt = i + f.a.a.a.fS(2, this.req.boi());
      }
      i = paramInt;
      if (this.rer != null) {
        i = paramInt + f.a.a.a.fS(3, this.rer.boi());
      }
      paramInt = i;
      if (this.res != null) {
        paramInt = i + f.a.a.a.fS(4, this.res.boi());
      }
      i = paramInt + f.a.a.a.fQ(5, this.reu);
      paramInt = i;
      if (this.rev != null) {
        paramInt = i + f.a.a.a.fS(6, this.rev.boi());
      }
      i = paramInt;
      if (this.rew != null) {
        i = paramInt + f.a.a.a.fS(7, this.rew.boi());
      }
      paramInt = i;
      if (this.rex != null) {
        paramInt = i + f.a.a.a.fS(8, this.rex.boi());
      }
      i = paramInt;
      if (this.rey != null) {
        i = paramInt + f.a.a.a.fS(9, this.rey.boi());
      }
      paramInt = i;
      if (this.rez != null) {
        paramInt = i + f.a.a.a.fS(10, this.rez.boi());
      }
      i = paramInt;
      if (this.reA != null) {
        i = paramInt + f.a.a.b.b.a.h(11, this.reA);
      }
      paramInt = i;
      if (this.reB != null) {
        paramInt = i + f.a.a.a.fS(12, this.reB.boi());
      }
      i = paramInt;
      if (this.reC != null) {
        i = paramInt + f.a.a.b.b.a.h(14, this.reC);
      }
      paramInt = i;
      if (this.reD != null) {
        paramInt = i + f.a.a.a.fS(15, this.reD.boi());
      }
      i = paramInt;
      if (this.reE != null) {
        i = paramInt + f.a.a.b.b.a.h(16, this.reE);
      }
      i = i + f.a.a.a.fQ(17, this.reF) + f.a.a.a.fQ(18, this.reG) + f.a.a.a.fQ(19, this.reH);
      paramInt = i;
      if (this.raI != null) {
        paramInt = i + f.a.a.b.b.a.h(20, this.raI);
      }
      return paramInt + f.a.a.a.fQ(21, this.reI);
    }
    if (paramInt == 2)
    {
      paramVarArgs = new f.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
      for (paramInt = com.tencent.mm.bk.a.a(paramVarArgs); paramInt > 0; paramInt = com.tencent.mm.bk.a.a(paramVarArgs)) {
        if (!super.a(paramVarArgs, this, paramInt)) {
          paramVarArgs.cJS();
        }
      }
      if (this.req == null) {
        throw new b("Not all required fields were included: SvrPubECDHKey");
      }
      if (this.rer == null) {
        throw new b("Not all required fields were included: SessionKey");
      }
      if (this.res == null) {
        throw new b("Not all required fields were included: AutoAuthKey");
      }
      return 0;
    }
    if (paramInt == 3)
    {
      Object localObject1 = (f.a.a.a.a)paramVarArgs[0];
      ec localec = (ec)paramVarArgs[1];
      paramInt = ((Integer)paramVarArgs[2]).intValue();
      Object localObject2;
      boolean bool;
      switch (paramInt)
      {
      case 13: 
      default: 
        return -1;
      case 1: 
        localec.iwE = ((f.a.a.a.a)localObject1).vHC.rY();
        return 0;
      case 2: 
        paramVarArgs = ((f.a.a.a.a)localObject1).IC(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new sx();
          localObject2 = new f.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((sx)localObject1).a((f.a.a.a.a)localObject2, (com.tencent.mm.bk.a)localObject1, com.tencent.mm.bk.a.a((f.a.a.a.a)localObject2))) {}
          localec.req = ((sx)localObject1);
          paramInt += 1;
        }
        return 0;
      case 3: 
        paramVarArgs = ((f.a.a.a.a)localObject1).IC(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new bhy();
          localObject2 = new f.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((bhy)localObject1).a((f.a.a.a.a)localObject2, (com.tencent.mm.bk.a)localObject1, com.tencent.mm.bk.a.a((f.a.a.a.a)localObject2))) {}
          localec.rer = ((bhy)localObject1);
          paramInt += 1;
        }
        return 0;
      case 4: 
        paramVarArgs = ((f.a.a.a.a)localObject1).IC(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new bhy();
          localObject2 = new f.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((bhy)localObject1).a((f.a.a.a.a)localObject2, (com.tencent.mm.bk.a)localObject1, com.tencent.mm.bk.a.a((f.a.a.a.a)localObject2))) {}
          localec.res = ((bhy)localObject1);
          paramInt += 1;
        }
        return 0;
      case 5: 
        localec.reu = ((f.a.a.a.a)localObject1).vHC.rY();
        return 0;
      case 6: 
        paramVarArgs = ((f.a.a.a.a)localObject1).IC(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new bhy();
          localObject2 = new f.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((bhy)localObject1).a((f.a.a.a.a)localObject2, (com.tencent.mm.bk.a)localObject1, com.tencent.mm.bk.a.a((f.a.a.a.a)localObject2))) {}
          localec.rev = ((bhy)localObject1);
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
          localObject1 = new cco();
          localObject2 = new f.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((cco)localObject1).a((f.a.a.a.a)localObject2, (com.tencent.mm.bk.a)localObject1, com.tencent.mm.bk.a.a((f.a.a.a.a)localObject2))) {}
          localec.rew = ((cco)localObject1);
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
          localObject1 = new cgf();
          localObject2 = new f.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((cgf)localObject1).a((f.a.a.a.a)localObject2, (com.tencent.mm.bk.a)localObject1, com.tencent.mm.bk.a.a((f.a.a.a.a)localObject2))) {}
          localec.rex = ((cgf)localObject1);
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
          localObject1 = new bhy();
          localObject2 = new f.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((bhy)localObject1).a((f.a.a.a.a)localObject2, (com.tencent.mm.bk.a)localObject1, com.tencent.mm.bk.a.a((f.a.a.a.a)localObject2))) {}
          localec.rey = ((bhy)localObject1);
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
          localObject1 = new bhy();
          localObject2 = new f.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((bhy)localObject1).a((f.a.a.a.a)localObject2, (com.tencent.mm.bk.a)localObject1, com.tencent.mm.bk.a.a((f.a.a.a.a)localObject2))) {}
          localec.rez = ((bhy)localObject1);
          paramInt += 1;
        }
        return 0;
      case 11: 
        localec.reA = ((f.a.a.a.a)localObject1).vHC.readString();
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
          for (bool = true; bool; bool = ((bhy)localObject1).a((f.a.a.a.a)localObject2, (com.tencent.mm.bk.a)localObject1, com.tencent.mm.bk.a.a((f.a.a.a.a)localObject2))) {}
          localec.reB = ((bhy)localObject1);
          paramInt += 1;
        }
        return 0;
      case 14: 
        localec.reC = ((f.a.a.a.a)localObject1).vHC.readString();
        return 0;
      case 15: 
        paramVarArgs = ((f.a.a.a.a)localObject1).IC(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new bnp();
          localObject2 = new f.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((bnp)localObject1).a((f.a.a.a.a)localObject2, (com.tencent.mm.bk.a)localObject1, com.tencent.mm.bk.a.a((f.a.a.a.a)localObject2))) {}
          localec.reD = ((bnp)localObject1);
          paramInt += 1;
        }
        return 0;
      case 16: 
        localec.reE = ((f.a.a.a.a)localObject1).vHC.readString();
        return 0;
      case 17: 
        localec.reF = ((f.a.a.a.a)localObject1).vHC.rY();
        return 0;
      case 18: 
        localec.reG = ((f.a.a.a.a)localObject1).vHC.rY();
        return 0;
      case 19: 
        localec.reH = ((f.a.a.a.a)localObject1).vHC.rY();
        return 0;
      case 20: 
        localec.raI = ((f.a.a.a.a)localObject1).vHC.readString();
        return 0;
      }
      localec.reI = ((f.a.a.a.a)localObject1).vHC.rY();
      return 0;
    }
    return -1;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes-dex2jar.jar!/com/tencent/mm/protocal/c/ec.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */