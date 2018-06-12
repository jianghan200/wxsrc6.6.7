package com.tencent.mm.protocal.c;

import java.util.LinkedList;

public final class aws
  extends bhd
{
  public String eJn;
  public String ksA;
  public int rZT;
  public aw rmQ;
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    if (paramInt == 0)
    {
      paramVarArgs = (f.a.a.c.a)paramVarArgs[0];
      if (this.shX != null)
      {
        paramVarArgs.fV(1, this.shX.boi());
        this.shX.a(paramVarArgs);
      }
      paramVarArgs.fT(2, this.rZT);
      if (this.ksA != null) {
        paramVarArgs.g(3, this.ksA);
      }
      if (this.eJn != null) {
        paramVarArgs.g(4, this.eJn);
      }
      if (this.rmQ != null)
      {
        paramVarArgs.fV(5, this.rmQ.boi());
        this.rmQ.a(paramVarArgs);
      }
      return 0;
    }
    if (paramInt == 1) {
      if (this.shX == null) {
        break label567;
      }
    }
    label567:
    for (paramInt = f.a.a.a.fS(1, this.shX.boi()) + 0;; paramInt = 0)
    {
      int i = paramInt + f.a.a.a.fQ(2, this.rZT);
      paramInt = i;
      if (this.ksA != null) {
        paramInt = i + f.a.a.b.b.a.h(3, this.ksA);
      }
      i = paramInt;
      if (this.eJn != null) {
        i = paramInt + f.a.a.b.b.a.h(4, this.eJn);
      }
      paramInt = i;
      if (this.rmQ != null) {
        paramInt = i + f.a.a.a.fS(5, this.rmQ.boi());
      }
      return paramInt;
      if (paramInt == 2)
      {
        paramVarArgs = new f.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
        for (paramInt = bhd.a(paramVarArgs); paramInt > 0; paramInt = bhd.a(paramVarArgs)) {
          if (!super.a(paramVarArgs, this, paramInt)) {
            paramVarArgs.cJS();
          }
        }
        break;
      }
      if (paramInt == 3)
      {
        Object localObject1 = (f.a.a.a.a)paramVarArgs[0];
        aws localaws = (aws)paramVarArgs[1];
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
            localaws.shX = ((fk)localObject1);
            paramInt += 1;
          }
        case 2: 
          localaws.rZT = ((f.a.a.a.a)localObject1).vHC.rY();
          return 0;
        case 3: 
          localaws.ksA = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        case 4: 
          localaws.eJn = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        }
        paramVarArgs = ((f.a.a.a.a)localObject1).IC(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new aw();
          localObject2 = new f.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((aw)localObject1).a((f.a.a.a.a)localObject2, (com.tencent.mm.bk.a)localObject1, bhd.a((f.a.a.a.a)localObject2))) {}
          localaws.rmQ = ((aw)localObject1);
          paramInt += 1;
        }
        break;
      }
      return -1;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/protocal/c/aws.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */