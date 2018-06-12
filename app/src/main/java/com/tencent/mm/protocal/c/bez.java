package com.tencent.mm.protocal.c;

import f.a.a.b;
import java.util.LinkedList;

public final class bez
  extends com.tencent.mm.bk.a
{
  public int id;
  public bhz sgA;
  public bhz sgB;
  public bhz sgC;
  public bhz sgD;
  public bhz sgE;
  public bhz sgF;
  public bhz sgx;
  public bhz sgy;
  public bhz sgz;
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    if (paramInt == 0)
    {
      paramVarArgs = (f.a.a.c.a)paramVarArgs[0];
      if (this.sgy == null) {
        throw new b("Not all required fields were included: province");
      }
      if (this.sgz == null) {
        throw new b("Not all required fields were included: city");
      }
      if (this.sgA == null) {
        throw new b("Not all required fields were included: district");
      }
      if (this.sgB == null) {
        throw new b("Not all required fields were included: zipcode");
      }
      if (this.sgC == null) {
        throw new b("Not all required fields were included: detail");
      }
      if (this.sgD == null) {
        throw new b("Not all required fields were included: name");
      }
      if (this.sgE == null) {
        throw new b("Not all required fields were included: phone");
      }
      paramVarArgs.fT(1, this.id);
      if (this.sgx != null)
      {
        paramVarArgs.fV(2, this.sgx.boi());
        this.sgx.a(paramVarArgs);
      }
      if (this.sgy != null)
      {
        paramVarArgs.fV(3, this.sgy.boi());
        this.sgy.a(paramVarArgs);
      }
      if (this.sgz != null)
      {
        paramVarArgs.fV(4, this.sgz.boi());
        this.sgz.a(paramVarArgs);
      }
      if (this.sgA != null)
      {
        paramVarArgs.fV(5, this.sgA.boi());
        this.sgA.a(paramVarArgs);
      }
      if (this.sgB != null)
      {
        paramVarArgs.fV(6, this.sgB.boi());
        this.sgB.a(paramVarArgs);
      }
      if (this.sgC != null)
      {
        paramVarArgs.fV(7, this.sgC.boi());
        this.sgC.a(paramVarArgs);
      }
      if (this.sgD != null)
      {
        paramVarArgs.fV(8, this.sgD.boi());
        this.sgD.a(paramVarArgs);
      }
      if (this.sgE != null)
      {
        paramVarArgs.fV(9, this.sgE.boi());
        this.sgE.a(paramVarArgs);
      }
      if (this.sgF != null)
      {
        paramVarArgs.fV(10, this.sgF.boi());
        this.sgF.a(paramVarArgs);
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
      i = f.a.a.a.fQ(1, this.id) + 0;
      paramInt = i;
      if (this.sgx != null) {
        paramInt = i + f.a.a.a.fS(2, this.sgx.boi());
      }
      i = paramInt;
      if (this.sgy != null) {
        i = paramInt + f.a.a.a.fS(3, this.sgy.boi());
      }
      paramInt = i;
      if (this.sgz != null) {
        paramInt = i + f.a.a.a.fS(4, this.sgz.boi());
      }
      i = paramInt;
      if (this.sgA != null) {
        i = paramInt + f.a.a.a.fS(5, this.sgA.boi());
      }
      paramInt = i;
      if (this.sgB != null) {
        paramInt = i + f.a.a.a.fS(6, this.sgB.boi());
      }
      i = paramInt;
      if (this.sgC != null) {
        i = paramInt + f.a.a.a.fS(7, this.sgC.boi());
      }
      paramInt = i;
      if (this.sgD != null) {
        paramInt = i + f.a.a.a.fS(8, this.sgD.boi());
      }
      i = paramInt;
      if (this.sgE != null) {
        i = paramInt + f.a.a.a.fS(9, this.sgE.boi());
      }
      paramInt = i;
    } while (this.sgF == null);
    return i + f.a.a.a.fS(10, this.sgF.boi());
    if (paramInt == 2)
    {
      paramVarArgs = new f.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
      for (paramInt = com.tencent.mm.bk.a.a(paramVarArgs); paramInt > 0; paramInt = com.tencent.mm.bk.a.a(paramVarArgs)) {
        if (!super.a(paramVarArgs, this, paramInt)) {
          paramVarArgs.cJS();
        }
      }
      if (this.sgy == null) {
        throw new b("Not all required fields were included: province");
      }
      if (this.sgz == null) {
        throw new b("Not all required fields were included: city");
      }
      if (this.sgA == null) {
        throw new b("Not all required fields were included: district");
      }
      if (this.sgB == null) {
        throw new b("Not all required fields were included: zipcode");
      }
      if (this.sgC == null) {
        throw new b("Not all required fields were included: detail");
      }
      if (this.sgD == null) {
        throw new b("Not all required fields were included: name");
      }
      if (this.sgE == null) {
        throw new b("Not all required fields were included: phone");
      }
      return 0;
    }
    if (paramInt == 3)
    {
      Object localObject1 = (f.a.a.a.a)paramVarArgs[0];
      bez localbez = (bez)paramVarArgs[1];
      paramInt = ((Integer)paramVarArgs[2]).intValue();
      Object localObject2;
      boolean bool;
      switch (paramInt)
      {
      default: 
        return -1;
      case 1: 
        localbez.id = ((f.a.a.a.a)localObject1).vHC.rY();
        return 0;
      case 2: 
        paramVarArgs = ((f.a.a.a.a)localObject1).IC(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new bhz();
          localObject2 = new f.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((bhz)localObject1).a((f.a.a.a.a)localObject2, (com.tencent.mm.bk.a)localObject1, com.tencent.mm.bk.a.a((f.a.a.a.a)localObject2))) {}
          localbez.sgx = ((bhz)localObject1);
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
          localObject1 = new bhz();
          localObject2 = new f.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((bhz)localObject1).a((f.a.a.a.a)localObject2, (com.tencent.mm.bk.a)localObject1, com.tencent.mm.bk.a.a((f.a.a.a.a)localObject2))) {}
          localbez.sgy = ((bhz)localObject1);
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
          localObject1 = new bhz();
          localObject2 = new f.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((bhz)localObject1).a((f.a.a.a.a)localObject2, (com.tencent.mm.bk.a)localObject1, com.tencent.mm.bk.a.a((f.a.a.a.a)localObject2))) {}
          localbez.sgz = ((bhz)localObject1);
          paramInt += 1;
        }
        return 0;
      case 5: 
        paramVarArgs = ((f.a.a.a.a)localObject1).IC(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new bhz();
          localObject2 = new f.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((bhz)localObject1).a((f.a.a.a.a)localObject2, (com.tencent.mm.bk.a)localObject1, com.tencent.mm.bk.a.a((f.a.a.a.a)localObject2))) {}
          localbez.sgA = ((bhz)localObject1);
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
          localObject1 = new bhz();
          localObject2 = new f.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((bhz)localObject1).a((f.a.a.a.a)localObject2, (com.tencent.mm.bk.a)localObject1, com.tencent.mm.bk.a.a((f.a.a.a.a)localObject2))) {}
          localbez.sgB = ((bhz)localObject1);
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
          localObject1 = new bhz();
          localObject2 = new f.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((bhz)localObject1).a((f.a.a.a.a)localObject2, (com.tencent.mm.bk.a)localObject1, com.tencent.mm.bk.a.a((f.a.a.a.a)localObject2))) {}
          localbez.sgC = ((bhz)localObject1);
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
          localObject1 = new bhz();
          localObject2 = new f.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((bhz)localObject1).a((f.a.a.a.a)localObject2, (com.tencent.mm.bk.a)localObject1, com.tencent.mm.bk.a.a((f.a.a.a.a)localObject2))) {}
          localbez.sgD = ((bhz)localObject1);
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
          localObject1 = new bhz();
          localObject2 = new f.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((bhz)localObject1).a((f.a.a.a.a)localObject2, (com.tencent.mm.bk.a)localObject1, com.tencent.mm.bk.a.a((f.a.a.a.a)localObject2))) {}
          localbez.sgE = ((bhz)localObject1);
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
        localObject1 = new bhz();
        localObject2 = new f.a.a.a.a((byte[])localObject2, unknownTagHandler);
        for (bool = true; bool; bool = ((bhz)localObject1).a((f.a.a.a.a)localObject2, (com.tencent.mm.bk.a)localObject1, com.tencent.mm.bk.a.a((f.a.a.a.a)localObject2))) {}
        localbez.sgF = ((bhz)localObject1);
        paramInt += 1;
      }
      return 0;
    }
    return -1;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/protocal/c/bez.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */