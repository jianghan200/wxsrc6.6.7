package com.tencent.mm.protocal.c;

import f.a.a.b;
import java.util.LinkedList;

public final class aha
  extends bhd
{
  public int Height;
  public String URL;
  public int Width;
  public String rKq;
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    if (paramInt == 0)
    {
      paramVarArgs = (f.a.a.c.a)paramVarArgs[0];
      if (this.URL == null) {
        throw new b("Not all required fields were included: URL");
      }
      if (this.rKq == null) {
        throw new b("Not all required fields were included: UserAgent");
      }
      if (this.shX != null)
      {
        paramVarArgs.fV(1, this.shX.boi());
        this.shX.a(paramVarArgs);
      }
      if (this.URL != null) {
        paramVarArgs.g(2, this.URL);
      }
      if (this.rKq != null) {
        paramVarArgs.g(3, this.rKq);
      }
      paramVarArgs.fT(4, this.Width);
      paramVarArgs.fT(5, this.Height);
      return 0;
    }
    if (paramInt == 1) {
      if (this.shX == null) {
        break label525;
      }
    }
    label525:
    for (int i = f.a.a.a.fS(1, this.shX.boi()) + 0;; i = 0)
    {
      paramInt = i;
      if (this.URL != null) {
        paramInt = i + f.a.a.b.b.a.h(2, this.URL);
      }
      i = paramInt;
      if (this.rKq != null) {
        i = paramInt + f.a.a.b.b.a.h(3, this.rKq);
      }
      return i + f.a.a.a.fQ(4, this.Width) + f.a.a.a.fQ(5, this.Height);
      if (paramInt == 2)
      {
        paramVarArgs = new f.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
        for (paramInt = bhd.a(paramVarArgs); paramInt > 0; paramInt = bhd.a(paramVarArgs)) {
          if (!super.a(paramVarArgs, this, paramInt)) {
            paramVarArgs.cJS();
          }
        }
        if (this.URL == null) {
          throw new b("Not all required fields were included: URL");
        }
        if (this.rKq != null) {
          break;
        }
        throw new b("Not all required fields were included: UserAgent");
      }
      if (paramInt == 3)
      {
        Object localObject1 = (f.a.a.a.a)paramVarArgs[0];
        aha localaha = (aha)paramVarArgs[1];
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
            localaha.shX = ((fk)localObject1);
            paramInt += 1;
          }
        case 2: 
          localaha.URL = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        case 3: 
          localaha.rKq = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        case 4: 
          localaha.Width = ((f.a.a.a.a)localObject1).vHC.rY();
          return 0;
        }
        localaha.Height = ((f.a.a.a.a)localObject1).vHC.rY();
        return 0;
      }
      return -1;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/tencent/mm/protocal/c/aha.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */