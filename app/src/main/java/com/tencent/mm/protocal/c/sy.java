package com.tencent.mm.protocal.c;

import f.a.a.b;
import java.util.LinkedList;

public final class sy
  extends bhd
{
  public String iwP;
  public String reS;
  public int rfe;
  public bhy rhB;
  public String rhI;
  public String rhg;
  public String rwg;
  public String rwh;
  public int rwi;
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    if (paramInt == 0)
    {
      paramVarArgs = (f.a.a.c.a)paramVarArgs[0];
      if (this.rhB == null) {
        throw new b("Not all required fields were included: RandomEncryKey");
      }
      if (this.shX != null)
      {
        paramVarArgs.fV(1, this.shX.boi());
        this.shX.a(paramVarArgs);
      }
      if (this.rhB != null)
      {
        paramVarArgs.fV(2, this.rhB.boi());
        this.rhB.a(paramVarArgs);
      }
      paramVarArgs.fT(3, this.rfe);
      if (this.rhg != null) {
        paramVarArgs.g(4, this.rhg);
      }
      if (this.iwP != null) {
        paramVarArgs.g(5, this.iwP);
      }
      if (this.rhI != null) {
        paramVarArgs.g(6, this.rhI);
      }
      if (this.rwg != null) {
        paramVarArgs.g(7, this.rwg);
      }
      if (this.reS != null) {
        paramVarArgs.g(8, this.reS);
      }
      if (this.rwh != null) {
        paramVarArgs.g(9, this.rwh);
      }
      paramVarArgs.fT(10, this.rwi);
      return 0;
    }
    if (paramInt == 1) {
      if (this.shX == null) {
        break label870;
      }
    }
    label870:
    for (paramInt = f.a.a.a.fS(1, this.shX.boi()) + 0;; paramInt = 0)
    {
      int i = paramInt;
      if (this.rhB != null) {
        i = paramInt + f.a.a.a.fS(2, this.rhB.boi());
      }
      i += f.a.a.a.fQ(3, this.rfe);
      paramInt = i;
      if (this.rhg != null) {
        paramInt = i + f.a.a.b.b.a.h(4, this.rhg);
      }
      i = paramInt;
      if (this.iwP != null) {
        i = paramInt + f.a.a.b.b.a.h(5, this.iwP);
      }
      paramInt = i;
      if (this.rhI != null) {
        paramInt = i + f.a.a.b.b.a.h(6, this.rhI);
      }
      i = paramInt;
      if (this.rwg != null) {
        i = paramInt + f.a.a.b.b.a.h(7, this.rwg);
      }
      paramInt = i;
      if (this.reS != null) {
        paramInt = i + f.a.a.b.b.a.h(8, this.reS);
      }
      i = paramInt;
      if (this.rwh != null) {
        i = paramInt + f.a.a.b.b.a.h(9, this.rwh);
      }
      return i + f.a.a.a.fQ(10, this.rwi);
      if (paramInt == 2)
      {
        paramVarArgs = new f.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
        for (paramInt = bhd.a(paramVarArgs); paramInt > 0; paramInt = bhd.a(paramVarArgs)) {
          if (!super.a(paramVarArgs, this, paramInt)) {
            paramVarArgs.cJS();
          }
        }
        if (this.rhB != null) {
          break;
        }
        throw new b("Not all required fields were included: RandomEncryKey");
      }
      if (paramInt == 3)
      {
        Object localObject1 = (f.a.a.a.a)paramVarArgs[0];
        sy localsy = (sy)paramVarArgs[1];
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
            localsy.shX = ((fk)localObject1);
            paramInt += 1;
          }
        case 2: 
          paramVarArgs = ((f.a.a.a.a)localObject1).IC(paramInt);
          i = paramVarArgs.size();
          paramInt = 0;
          while (paramInt < i)
          {
            localObject2 = (byte[])paramVarArgs.get(paramInt);
            localObject1 = new bhy();
            localObject2 = new f.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = ((bhy)localObject1).a((f.a.a.a.a)localObject2, (com.tencent.mm.bk.a)localObject1, bhd.a((f.a.a.a.a)localObject2))) {}
            localsy.rhB = ((bhy)localObject1);
            paramInt += 1;
          }
        case 3: 
          localsy.rfe = ((f.a.a.a.a)localObject1).vHC.rY();
          return 0;
        case 4: 
          localsy.rhg = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        case 5: 
          localsy.iwP = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        case 6: 
          localsy.rhI = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        case 7: 
          localsy.rwg = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        case 8: 
          localsy.reS = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        case 9: 
          localsy.rwh = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        }
        localsy.rwi = ((f.a.a.a.a)localObject1).vHC.rY();
        return 0;
      }
      return -1;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/mm/protocal/c/sy.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */