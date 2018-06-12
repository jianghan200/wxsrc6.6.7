package d.a.a;

import java.util.LinkedList;

public final class b
  extends com.tencent.mm.bk.a
{
  public int srY;
  public String url;
  public f vGU;
  public String vGV;
  public String vGW;
  public String vGX;
  public String vGY;
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    if (paramInt == 0)
    {
      paramVarArgs = (f.a.a.c.a)paramVarArgs[0];
      if (this.vGU != null)
      {
        paramVarArgs.fV(1, this.vGU.boi());
        this.vGU.a(paramVarArgs);
      }
      if (this.url != null) {
        paramVarArgs.g(2, this.url);
      }
      if (this.vGV != null) {
        paramVarArgs.g(3, this.vGV);
      }
      if (this.vGW != null) {
        paramVarArgs.g(4, this.vGW);
      }
      paramVarArgs.fT(5, this.srY);
      if (this.vGX != null) {
        paramVarArgs.g(6, this.vGX);
      }
      if (this.vGY != null) {
        paramVarArgs.g(7, this.vGY);
      }
      return 0;
    }
    if (paramInt == 1) {
      if (this.vGU == null) {
        break label591;
      }
    }
    label591:
    for (int i = f.a.a.a.fS(1, this.vGU.boi()) + 0;; i = 0)
    {
      paramInt = i;
      if (this.url != null) {
        paramInt = i + f.a.a.b.b.a.h(2, this.url);
      }
      i = paramInt;
      if (this.vGV != null) {
        i = paramInt + f.a.a.b.b.a.h(3, this.vGV);
      }
      paramInt = i;
      if (this.vGW != null) {
        paramInt = i + f.a.a.b.b.a.h(4, this.vGW);
      }
      i = paramInt + f.a.a.a.fQ(5, this.srY);
      paramInt = i;
      if (this.vGX != null) {
        paramInt = i + f.a.a.b.b.a.h(6, this.vGX);
      }
      i = paramInt;
      if (this.vGY != null) {
        i = paramInt + f.a.a.b.b.a.h(7, this.vGY);
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
        break;
      }
      if (paramInt == 3)
      {
        Object localObject1 = (f.a.a.a.a)paramVarArgs[0];
        b localb = (b)paramVarArgs[1];
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
            localObject1 = new f();
            localObject2 = new f.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (boolean bool = true; bool; bool = ((f)localObject1).a((f.a.a.a.a)localObject2, (com.tencent.mm.bk.a)localObject1, com.tencent.mm.bk.a.a((f.a.a.a.a)localObject2))) {}
            localb.vGU = ((f)localObject1);
            paramInt += 1;
          }
        case 2: 
          localb.url = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        case 3: 
          localb.vGV = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        case 4: 
          localb.vGW = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        case 5: 
          localb.srY = ((f.a.a.a.a)localObject1).vHC.rY();
          return 0;
        case 6: 
          localb.vGX = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        }
        localb.vGY = ((f.a.a.a.a)localObject1).vHC.readString();
        return 0;
      }
      return -1;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/d/a/a/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */