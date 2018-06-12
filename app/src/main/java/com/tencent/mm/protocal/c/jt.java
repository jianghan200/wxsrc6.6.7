package com.tencent.mm.protocal.c;

import f.a.a.b;
import java.util.LinkedList;

public final class jt
  extends com.tencent.mm.bk.a
{
  public String hcS;
  public String jOU;
  public jv rlg;
  public bjv rlj;
  public ka rlk;
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    if (paramInt == 0)
    {
      paramVarArgs = (f.a.a.c.a)paramVarArgs[0];
      if (this.hcS == null) {
        throw new b("Not all required fields were included: NickName");
      }
      if (this.rlj == null) {
        throw new b("Not all required fields were included: ContactItem");
      }
      if (this.hcS != null) {
        paramVarArgs.g(1, this.hcS);
      }
      if (this.rlg != null)
      {
        paramVarArgs.fV(2, this.rlg.boi());
        this.rlg.a(paramVarArgs);
      }
      if (this.rlj != null)
      {
        paramVarArgs.fV(3, this.rlj.boi());
        this.rlj.a(paramVarArgs);
      }
      if (this.rlk != null)
      {
        paramVarArgs.fV(4, this.rlk.boi());
        this.rlk.a(paramVarArgs);
      }
      if (this.jOU != null) {
        paramVarArgs.g(5, this.jOU);
      }
      return 0;
    }
    if (paramInt == 1) {
      if (this.hcS == null) {
        break label745;
      }
    }
    label745:
    for (int i = f.a.a.b.b.a.h(1, this.hcS) + 0;; i = 0)
    {
      paramInt = i;
      if (this.rlg != null) {
        paramInt = i + f.a.a.a.fS(2, this.rlg.boi());
      }
      i = paramInt;
      if (this.rlj != null) {
        i = paramInt + f.a.a.a.fS(3, this.rlj.boi());
      }
      paramInt = i;
      if (this.rlk != null) {
        paramInt = i + f.a.a.a.fS(4, this.rlk.boi());
      }
      i = paramInt;
      if (this.jOU != null) {
        i = paramInt + f.a.a.b.b.a.h(5, this.jOU);
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
        if (this.hcS == null) {
          throw new b("Not all required fields were included: NickName");
        }
        if (this.rlj != null) {
          break;
        }
        throw new b("Not all required fields were included: ContactItem");
      }
      if (paramInt == 3)
      {
        Object localObject1 = (f.a.a.a.a)paramVarArgs[0];
        jt localjt = (jt)paramVarArgs[1];
        paramInt = ((Integer)paramVarArgs[2]).intValue();
        Object localObject2;
        boolean bool;
        switch (paramInt)
        {
        default: 
          return -1;
        case 1: 
          localjt.hcS = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        case 2: 
          paramVarArgs = ((f.a.a.a.a)localObject1).IC(paramInt);
          i = paramVarArgs.size();
          paramInt = 0;
          while (paramInt < i)
          {
            localObject2 = (byte[])paramVarArgs.get(paramInt);
            localObject1 = new jv();
            localObject2 = new f.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = ((jv)localObject1).a((f.a.a.a.a)localObject2, (com.tencent.mm.bk.a)localObject1, com.tencent.mm.bk.a.a((f.a.a.a.a)localObject2))) {}
            localjt.rlg = ((jv)localObject1);
            paramInt += 1;
          }
        case 3: 
          paramVarArgs = ((f.a.a.a.a)localObject1).IC(paramInt);
          i = paramVarArgs.size();
          paramInt = 0;
          while (paramInt < i)
          {
            localObject2 = (byte[])paramVarArgs.get(paramInt);
            localObject1 = new bjv();
            localObject2 = new f.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = ((bjv)localObject1).a((f.a.a.a.a)localObject2, (com.tencent.mm.bk.a)localObject1, com.tencent.mm.bk.a.a((f.a.a.a.a)localObject2))) {}
            localjt.rlj = ((bjv)localObject1);
            paramInt += 1;
          }
        case 4: 
          paramVarArgs = ((f.a.a.a.a)localObject1).IC(paramInt);
          i = paramVarArgs.size();
          paramInt = 0;
          while (paramInt < i)
          {
            localObject2 = (byte[])paramVarArgs.get(paramInt);
            localObject1 = new ka();
            localObject2 = new f.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = ((ka)localObject1).a((f.a.a.a.a)localObject2, (com.tencent.mm.bk.a)localObject1, com.tencent.mm.bk.a.a((f.a.a.a.a)localObject2))) {}
            localjt.rlk = ((ka)localObject1);
            paramInt += 1;
          }
        }
        localjt.jOU = ((f.a.a.a.a)localObject1).vHC.readString();
        return 0;
      }
      return -1;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/tencent/mm/protocal/c/jt.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */