package com.tencent.mm.protocal.c;

import f.a.a.b;
import java.util.LinkedList;

public final class bcg
  extends bhd
{
  public int rxG;
  public bhz seA;
  public int seB;
  public long seh;
  public bhz sey;
  public bhz sez;
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    if (paramInt == 0)
    {
      paramVarArgs = (f.a.a.c.a)paramVarArgs[0];
      if (this.sey == null) {
        throw new b("Not all required fields were included: ClientReport");
      }
      if (this.sez == null) {
        throw new b("Not all required fields were included: ChannelReport");
      }
      if (this.seA == null) {
        throw new b("Not all required fields were included: EngineReport");
      }
      if (this.shX != null)
      {
        paramVarArgs.fV(1, this.shX.boi());
        this.shX.a(paramVarArgs);
      }
      if (this.sey != null)
      {
        paramVarArgs.fV(2, this.sey.boi());
        this.sey.a(paramVarArgs);
      }
      if (this.sez != null)
      {
        paramVarArgs.fV(3, this.sez.boi());
        this.sez.a(paramVarArgs);
      }
      if (this.seA != null)
      {
        paramVarArgs.fV(4, this.seA.boi());
        this.seA.a(paramVarArgs);
      }
      paramVarArgs.fT(5, this.rxG);
      paramVarArgs.T(6, this.seh);
      paramVarArgs.fT(7, this.seB);
      return 0;
    }
    if (paramInt == 1) {
      if (this.shX == null) {
        break label929;
      }
    }
    label929:
    for (int i = f.a.a.a.fS(1, this.shX.boi()) + 0;; i = 0)
    {
      paramInt = i;
      if (this.sey != null) {
        paramInt = i + f.a.a.a.fS(2, this.sey.boi());
      }
      i = paramInt;
      if (this.sez != null) {
        i = paramInt + f.a.a.a.fS(3, this.sez.boi());
      }
      paramInt = i;
      if (this.seA != null) {
        paramInt = i + f.a.a.a.fS(4, this.seA.boi());
      }
      return paramInt + f.a.a.a.fQ(5, this.rxG) + f.a.a.a.S(6, this.seh) + f.a.a.a.fQ(7, this.seB);
      if (paramInt == 2)
      {
        paramVarArgs = new f.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
        for (paramInt = bhd.a(paramVarArgs); paramInt > 0; paramInt = bhd.a(paramVarArgs)) {
          if (!super.a(paramVarArgs, this, paramInt)) {
            paramVarArgs.cJS();
          }
        }
        if (this.sey == null) {
          throw new b("Not all required fields were included: ClientReport");
        }
        if (this.sez == null) {
          throw new b("Not all required fields were included: ChannelReport");
        }
        if (this.seA != null) {
          break;
        }
        throw new b("Not all required fields were included: EngineReport");
      }
      if (paramInt == 3)
      {
        Object localObject1 = (f.a.a.a.a)paramVarArgs[0];
        bcg localbcg = (bcg)paramVarArgs[1];
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
            localbcg.shX = ((fk)localObject1);
            paramInt += 1;
          }
        case 2: 
          paramVarArgs = ((f.a.a.a.a)localObject1).IC(paramInt);
          i = paramVarArgs.size();
          paramInt = 0;
          while (paramInt < i)
          {
            localObject2 = (byte[])paramVarArgs.get(paramInt);
            localObject1 = new bhz();
            localObject2 = new f.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = ((bhz)localObject1).a((f.a.a.a.a)localObject2, (com.tencent.mm.bk.a)localObject1, bhd.a((f.a.a.a.a)localObject2))) {}
            localbcg.sey = ((bhz)localObject1);
            paramInt += 1;
          }
        case 3: 
          paramVarArgs = ((f.a.a.a.a)localObject1).IC(paramInt);
          i = paramVarArgs.size();
          paramInt = 0;
          while (paramInt < i)
          {
            localObject2 = (byte[])paramVarArgs.get(paramInt);
            localObject1 = new bhz();
            localObject2 = new f.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = ((bhz)localObject1).a((f.a.a.a.a)localObject2, (com.tencent.mm.bk.a)localObject1, bhd.a((f.a.a.a.a)localObject2))) {}
            localbcg.sez = ((bhz)localObject1);
            paramInt += 1;
          }
        case 4: 
          paramVarArgs = ((f.a.a.a.a)localObject1).IC(paramInt);
          i = paramVarArgs.size();
          paramInt = 0;
          while (paramInt < i)
          {
            localObject2 = (byte[])paramVarArgs.get(paramInt);
            localObject1 = new bhz();
            localObject2 = new f.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = ((bhz)localObject1).a((f.a.a.a.a)localObject2, (com.tencent.mm.bk.a)localObject1, bhd.a((f.a.a.a.a)localObject2))) {}
            localbcg.seA = ((bhz)localObject1);
            paramInt += 1;
          }
        case 5: 
          localbcg.rxG = ((f.a.a.a.a)localObject1).vHC.rY();
          return 0;
        case 6: 
          localbcg.seh = ((f.a.a.a.a)localObject1).vHC.rZ();
          return 0;
        }
        localbcg.seB = ((f.a.a.a.a)localObject1).vHC.rY();
        return 0;
      }
      return -1;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/protocal/c/bcg.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */