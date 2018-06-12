package com.tencent.mm.protocal.c;

import f.a.a.b;
import java.util.LinkedList;

public final class caw
  extends bhd
{
  public int rnx;
  public bhy rny;
  public int rxG;
  public long rxH;
  public String seC;
  public long suO;
  public bzu sxh;
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    if (paramInt == 0)
    {
      paramVarArgs = (f.a.a.c.a)paramVarArgs[0];
      if (this.rny == null) {
        throw new b("Not all required fields were included: KeyBuf");
      }
      if (this.sxh == null) {
        throw new b("Not all required fields were included: OpLog");
      }
      if (this.shX != null)
      {
        paramVarArgs.fV(1, this.shX.boi());
        this.shX.a(paramVarArgs);
      }
      if (this.seC != null) {
        paramVarArgs.g(2, this.seC);
      }
      paramVarArgs.fT(3, this.rxG);
      if (this.rny != null)
      {
        paramVarArgs.fV(4, this.rny.boi());
        this.rny.a(paramVarArgs);
      }
      if (this.sxh != null)
      {
        paramVarArgs.fV(5, this.sxh.boi());
        this.sxh.a(paramVarArgs);
      }
      paramVarArgs.T(6, this.rxH);
      paramVarArgs.fT(7, this.rnx);
      paramVarArgs.T(8, this.suO);
      return 0;
    }
    if (paramInt == 1) {
      if (this.shX == null) {
        break label846;
      }
    }
    label846:
    for (paramInt = f.a.a.a.fS(1, this.shX.boi()) + 0;; paramInt = 0)
    {
      int i = paramInt;
      if (this.seC != null) {
        i = paramInt + f.a.a.b.b.a.h(2, this.seC);
      }
      i += f.a.a.a.fQ(3, this.rxG);
      paramInt = i;
      if (this.rny != null) {
        paramInt = i + f.a.a.a.fS(4, this.rny.boi());
      }
      i = paramInt;
      if (this.sxh != null) {
        i = paramInt + f.a.a.a.fS(5, this.sxh.boi());
      }
      return i + f.a.a.a.S(6, this.rxH) + f.a.a.a.fQ(7, this.rnx) + f.a.a.a.S(8, this.suO);
      if (paramInt == 2)
      {
        paramVarArgs = new f.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
        for (paramInt = bhd.a(paramVarArgs); paramInt > 0; paramInt = bhd.a(paramVarArgs)) {
          if (!super.a(paramVarArgs, this, paramInt)) {
            paramVarArgs.cJS();
          }
        }
        if (this.rny == null) {
          throw new b("Not all required fields were included: KeyBuf");
        }
        if (this.sxh != null) {
          break;
        }
        throw new b("Not all required fields were included: OpLog");
      }
      if (paramInt == 3)
      {
        Object localObject1 = (f.a.a.a.a)paramVarArgs[0];
        caw localcaw = (caw)paramVarArgs[1];
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
            localcaw.shX = ((fk)localObject1);
            paramInt += 1;
          }
        case 2: 
          localcaw.seC = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        case 3: 
          localcaw.rxG = ((f.a.a.a.a)localObject1).vHC.rY();
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
            for (bool = true; bool; bool = ((bhy)localObject1).a((f.a.a.a.a)localObject2, (com.tencent.mm.bk.a)localObject1, bhd.a((f.a.a.a.a)localObject2))) {}
            localcaw.rny = ((bhy)localObject1);
            paramInt += 1;
          }
        case 5: 
          paramVarArgs = ((f.a.a.a.a)localObject1).IC(paramInt);
          i = paramVarArgs.size();
          paramInt = 0;
          while (paramInt < i)
          {
            localObject2 = (byte[])paramVarArgs.get(paramInt);
            localObject1 = new bzu();
            localObject2 = new f.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = ((bzu)localObject1).a((f.a.a.a.a)localObject2, (com.tencent.mm.bk.a)localObject1, bhd.a((f.a.a.a.a)localObject2))) {}
            localcaw.sxh = ((bzu)localObject1);
            paramInt += 1;
          }
        case 6: 
          localcaw.rxH = ((f.a.a.a.a)localObject1).vHC.rZ();
          return 0;
        case 7: 
          localcaw.rnx = ((f.a.a.a.a)localObject1).vHC.rY();
          return 0;
        }
        localcaw.suO = ((f.a.a.a.a)localObject1).vHC.rZ();
        return 0;
      }
      return -1;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/mm/protocal/c/caw.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */