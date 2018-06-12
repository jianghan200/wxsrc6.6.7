package com.tencent.mm.protocal.c;

import java.util.LinkedList;

public final class bis
  extends bhd
{
  public String bPS;
  public String scope;
  public String sjf;
  public String sjg;
  public String sjh;
  public String state;
  
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
      if (this.bPS != null) {
        paramVarArgs.g(2, this.bPS);
      }
      if (this.scope != null) {
        paramVarArgs.g(3, this.scope);
      }
      if (this.state != null) {
        paramVarArgs.g(4, this.state);
      }
      if (this.sjf != null) {
        paramVarArgs.g(5, this.sjf);
      }
      if (this.sjg != null) {
        paramVarArgs.g(6, this.sjg);
      }
      if (this.sjh != null) {
        paramVarArgs.g(7, this.sjh);
      }
      return 0;
    }
    if (paramInt == 1) {
      if (this.shX == null) {
        break label607;
      }
    }
    label607:
    for (int i = f.a.a.a.fS(1, this.shX.boi()) + 0;; i = 0)
    {
      paramInt = i;
      if (this.bPS != null) {
        paramInt = i + f.a.a.b.b.a.h(2, this.bPS);
      }
      i = paramInt;
      if (this.scope != null) {
        i = paramInt + f.a.a.b.b.a.h(3, this.scope);
      }
      paramInt = i;
      if (this.state != null) {
        paramInt = i + f.a.a.b.b.a.h(4, this.state);
      }
      i = paramInt;
      if (this.sjf != null) {
        i = paramInt + f.a.a.b.b.a.h(5, this.sjf);
      }
      paramInt = i;
      if (this.sjg != null) {
        paramInt = i + f.a.a.b.b.a.h(6, this.sjg);
      }
      i = paramInt;
      if (this.sjh != null) {
        i = paramInt + f.a.a.b.b.a.h(7, this.sjh);
      }
      return i;
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
        bis localbis = (bis)paramVarArgs[1];
        paramInt = ((Integer)paramVarArgs[2]).intValue();
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
            Object localObject2 = (byte[])paramVarArgs.get(paramInt);
            localObject1 = new fk();
            localObject2 = new f.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (boolean bool = true; bool; bool = ((fk)localObject1).a((f.a.a.a.a)localObject2, (com.tencent.mm.bk.a)localObject1, bhd.a((f.a.a.a.a)localObject2))) {}
            localbis.shX = ((fk)localObject1);
            paramInt += 1;
          }
        case 2: 
          localbis.bPS = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        case 3: 
          localbis.scope = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        case 4: 
          localbis.state = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        case 5: 
          localbis.sjf = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        case 6: 
          localbis.sjg = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        }
        localbis.sjh = ((f.a.a.a.a)localObject1).vHC.readString();
        return 0;
      }
      return -1;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/protocal/c/bis.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */